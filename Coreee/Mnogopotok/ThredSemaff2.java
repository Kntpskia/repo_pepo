package Java_2023.Coreee.Mnogopotok;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ThredSemaff2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        Connection connection = Connection.getConnection();
        for (int i = 0; i < 6; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
    }
}

class Connection {

    private int connectionCount;
    private static Connection connection = new Connection();
    private Semaphore semaphore=new Semaphore(5);//Ограничивает доступ к ресурусу

    private Connection() {//Не может иметь объект этого класса

    }

    public static Connection getConnection() {//Не может иметь объект этого класса
        return connection;
    }

    public void work() throws InterruptedException {//обернули  метод ду ворк в другой метод для метода релиз ,который должен вызываться в файнали блоке тк метод ду ворк может быть не ввполнен
        semaphore.acquire();
        try {
            doWork();
        }finally {
            semaphore.release();   //Но в любом случае будет вызван метод релиз
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {

            connectionCount++;
            System.out.println(connectionCount);

        }


        Thread.sleep(1000);

        synchronized (this) {
            connectionCount--;
        }
    }
}
