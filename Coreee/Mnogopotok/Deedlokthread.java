package Java_2023.Coreee.Mnogopotok;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deedlokthread {//Ситуация .когда потоки бесконечно  ждут друг друга. Избежать этого можно ,в одном порядке использовать локи
    public static void main(String[] args) throws InterruptedException {


        Runnner runnner = new Runnner();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runnner.first();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runnner.second();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        runnner.finish();
    }

}

class Runnner {
    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1= new ReentrantLock();
    private Lock lock2= new ReentrantLock();


    private void take(Lock lock1,Lock lock2) throws InterruptedException {
        boolean firstlocktake = false;
        boolean secondlocktake = false;
        while (true) {
            try {
                firstlocktake = lock1.tryLock();//Метод пытается забарть лок и вернуть тру
                secondlocktake = lock2.tryLock();
            } finally {
                if (firstlocktake && secondlocktake) {//Если мы не забрали 2 потока ,то возвращаем один из них ,чтобы не было дедлока
                    return;//Выходим из бесконечного цикла ваил
                }
                if (firstlocktake) {
                    lock1.unlock();
                }
                if (secondlocktake) {
                    lock2.unlock();
                }
            }
            Thread.sleep(1000);
        }
    }

    public void first() throws InterruptedException {
        Random random=new Random();
        for (int i=0;i<100; i++) {
            take(lock1, lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void second() throws InterruptedException {
        Random random=new Random();
        for (int i=0;i<100; i++){
            take(lock2,lock1);
            try {
        Account.transfer(account1,account2, random.nextInt(100));
        }finally {
            lock1.unlock();
            lock2.unlock();
        }
    }
    }

    public void finish() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Summa "+(account1.getBalance()+account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;

    }

    public void with(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.deposit(amount);
        acc2.with(amount);

    }
}