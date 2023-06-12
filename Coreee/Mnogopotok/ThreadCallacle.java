package Java_2023.Coreee.Mnogopotok;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCallacle {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        /*executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Arsic");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Marsic");

            }
        });
        executorService.shutdown();*/


        executorService.submit(new Callable<Integer>() {//Интерфейс с возможностью вернуть ретернуть данные
            @Override
            public Integer call() throws Exception {
                System.out.println("Arsic");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Marsic");
                return 5;
            }
        });
        executorService.shutdown();
    }
}
