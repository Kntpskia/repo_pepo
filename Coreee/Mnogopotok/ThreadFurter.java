package Java_2023.Coreee.Mnogopotok;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadFurter {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future= executorService.submit(new Callable<Integer>() {//Интерфейс с возможностью вернуть ретернуть данные
            @Override
            public Integer call() throws Exception {
                System.out.println("Arsic");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Marsic");
                Random random=new Random();

                return random.nextInt(100);
            }
        });
        executorService.shutdown();
        try {
            int result =future.get();//Дожидается окончание потока
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
