package Java_2023.Coreee.Mnogopotok;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdCons {
    private static   BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);//Интерефейс , реализация этого интрефейса клас аррей,предельный размер 10


    public static void main(String[] args) throws InterruptedException {
        //java util concurrent - все для многопоточки - все классы потоко - безопасны, т.е. синхронизованны.

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();//Запуск потока
        thread2.start();
        thread1.join();//Дождаться окончания
        thread2.join();

    }


    private static  void produce() throws InterruptedException {
        Random  random=new Random();
        while(true){
            queue.put(random.nextInt(100));//Добавляет в очередь  пользователя до 10 штук в одной очереди возможно
        }
    }
    private static  void consumer() throws InterruptedException {

        while(true){
            Thread.sleep(100);
            queue.take();
            System.out.println("Queue is "+queue.size());
        }
    }
}
