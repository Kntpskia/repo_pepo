package Java_2023.Coreee.Mnogopotok;

import java.util.Scanner;

public class WaitNDNotifi {
    public static void main(String[] args) throws InterruptedException {


//Методы вэйт и нотифай -это методы класса обджект
    WaaitANdnot waaitANdnot= new WaaitANdnot();
 Thread thread1=new Thread(new Runnable() {
     @Override
     public void run() {
         try {
             waaitANdnot.prod();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

     }
 });
 Thread thread2=new Thread(new Runnable() {
     @Override
     public void run() {
         try {
             waaitANdnot.cons();
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

class WaaitANdnot{
  //  Object lock= new Object();
    public void prod() throws InterruptedException {
        synchronized (this){
            System.out.println("I love Ars");
            this.wait();//Только внутри синхронизированных блоков может вызываться -метод отдает монитор,ждем нотифай этого объекта
           // lock.wait(10000);//ПРодолжит свое выполненние после конкретного времени , если будет доступен монитор
            System.out.println("I love Ars SO MUCH");
        }

    }
    public void cons() throws InterruptedException {
        Thread.sleep(1000);
        Scanner scanner= new Scanner(System.in);

        synchronized (this){
            System.out.println("Love");
            scanner.nextLine();//Ждет энтер

            this.notify();//Возвращает к работе  1 поток с методом вэйт,оповещает его . Не возвращаем монитор (2 условия - монитор у потока (пока конс не закончит блок зис )  вызван нотифай)
        }
    }
}
