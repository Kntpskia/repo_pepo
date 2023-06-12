package Java_2023.Coreee.Mnogopotok;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThredReentran {
    public static void main(String[] args) throws InterruptedException {
        Task task1=new Task();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                task1.first();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                task1.second();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        task1.showCounter();

    }
}

class Task{
    private int count;

    private Lock lock= new ReentrantLock();

    private void increment(){
        for (int i=1;i<100;i++){
            count++;
        }

    }

    public void first(){
        lock.lock();//Забирает экран
        increment();
        lock.unlock();//Возвращает экран
    }
    public void second(){
        lock.lock();
        increment();
        lock.unlock();
    }
 public void showCounter(){
     System.out.println(count);
 }
}
