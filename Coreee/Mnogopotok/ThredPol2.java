package Java_2023.Coreee.Mnogopotok;

import java.util.LinkedList;
import java.util.Queue;


public class ThredPol2 {


    public static void main(String[] args) throws InterruptedException {


//Методы вэйт и нотифай -это методы класса обджект
        ProCon proCon= new ProCon();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proCon.prod();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proCon.cons();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

    class ProCon{
        private  Queue<Integer> queue=new LinkedList<>();//Потоко опасныая очередь
        private final int LIMIT=10;
        private final Object lock =new Object();
        public void prod() throws InterruptedException {

            int value =0;
            while (true){
            synchronized (lock){
                while (queue.size()==LIMIT){//Повторно войти в цикл (проверить  условие) ,чтобы обезопасить себя  
                    lock.wait();
                }
                    queue.offer(value++);
                lock.notify();//Как получили новое значение , можно запустить консьюмера
            }

        }
        }
        public void cons() throws InterruptedException {
            while (true){
            synchronized (lock){
                while (queue.size()==0){
                    lock.wait();
                }


                int value=queue.poll();//Достает элемент из очереди
                System.out.println(value);
                System.out.println(queue.size());
                lock.notify();//Мы получили элемент ,теперь на 1 место больше значений
            }
            Thread.sleep(1000);
                }


            }
        }
