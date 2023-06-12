package Java_2023.Coreee.Mnogopotok;

import java.util.Random;

public class TestStop {
    public static void main(String[] args) throws InterruptedException {
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                Random random=new Random();
                for (int i=0;i<100;i++){
                    if(Thread.currentThread().isInterrupted()){//Если нас прервали ,то
                        System.out.println("Stop");
                        break;
                    }
                    Math.sin(random.nextDouble());

                }
            }
        });
        System.out.println("Ars");
        thread.start();
        thread.interrupt();//Прерывает выполнение не вызывая неопределенного состояния (а не останавливает поток как устаревший метод стоп)
        thread.join();
        System.out.println("Mars is sladkiu bananulechek");
    }
}
