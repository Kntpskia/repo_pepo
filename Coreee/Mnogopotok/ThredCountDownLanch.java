package Java_2023.Coreee.Mnogopotok;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThredCountDownLanch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(3);//при создании объекта укзаываем кличество итерация ,прежде чем отопрется защелка
        // останавливает пришедшие потоки, пока внутренний счетчик не достигнет нуля.

        ExecutorService executorService= Executors.newFixedThreadPool(3);//Создали 3 потока
        for (int i =0; i<3;i++){
            executorService.submit(new Processor(countDownLatch));//Метод распределяет задания
        }
            executorService.shutdown();//Заканчивает задания потоков
            countDownLatch.await();
            System.out.println("I love Ars");


    }
}


class Processor implements Runnable{
    private CountDownLatch countDownLatch1;
    public  Processor(CountDownLatch countDownLatch2){//Конструктор
        this.countDownLatch1=countDownLatch2;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch1.countDown();//Обратный отчет потоков

    }
}