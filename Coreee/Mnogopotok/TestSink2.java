package Java_2023.Coreee.Mnogopotok;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestSink2 {

    public static void main(String[] args) throws InterruptedException {
      Worker worker=new Worker();
      worker.main();

      new Worker().main();
    }



}

class Worker{
    Random random=new Random();

    Object lock1=new Object();//СОздаем объекты для синхронизации и одновременной работы потоков
    Object lock2=new Object();


    private List<Integer> integerList1=new ArrayList<>();
    private List<Integer> integerList2=new ArrayList<>();

    public  void addList1() {
        synchronized (lock1){//Синхронизаруемся на объекте лок 1 ,один объект один монитор
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            integerList1.add(random.nextInt(100)); //рандомное число от 0 до 100
        }
    }

    public  void addList2() {
        synchronized (lock2) {//Используеем блок синхронизации , указывая объект выше
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            integerList2.add(random.nextInt(50)); //рандомное число от 0 до 100
        }
    }



    public  void work() {
        for (int i = 0; i < 10; i++) {
            addList1();
            addList2();
        }
    }

    public void main() throws InterruptedException {
        Thread thread1=new Thread(()->{
            work();
        });
        Thread thread2=new Thread(()->{
            work();
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long before =System.currentTimeMillis();
        long after =System.currentTimeMillis();

        System.out.println(after-before);
        System.out.println(integerList1.size());
        System.out.println(integerList2.size());
    }
}



