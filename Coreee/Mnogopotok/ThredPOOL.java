package Java_2023.Coreee.Mnogopotok;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThredPOOL {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);//Пулл потоков из нескольких потоков ,сервис по выполеннию = Класс экзекьютерс
        for(int i=0; i<5; i++){
            executorService.submit(new Work(i));//Передали 5 команд  ран в 2 потока
        }
        executorService.shutdown();//Завершили команду
        executorService.awaitTermination(1, TimeUnit.DAYS);//Сколько мы готовы ждать выполенние команд в 2-х потоках,
            }
}

class Work implements Runnable{
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ars-Mars "+ id);
    }
}