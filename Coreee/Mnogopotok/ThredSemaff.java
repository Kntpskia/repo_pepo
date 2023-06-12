package Java_2023.Coreee.Mnogopotok;

import java.util.concurrent.Semaphore;

public class ThredSemaff {
    public static void main(String[] args) {
        Semaphore semaphore= new Semaphore(3);//Если Ограничение доступа к ресурсу,то мы даем  3 разрешения - количество потоков, одновременно использующих ресурс.

        try {
            semaphore.acquire();//Наинает взимодействие с ресурсом,4  поток будет ждать  пока 3 потока не вызовут метод релиз (2 команда ниже)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();//Отдает разрешение
        System.out.println(semaphore.availablePermits()); //

    }
}
