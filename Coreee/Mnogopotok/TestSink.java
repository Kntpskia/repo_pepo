package Java_2023.Coreee.Mnogopotok;


public class TestSink {
    private int count;
    public static void main(String[] args) throws InterruptedException {
        TestSink testSink=new TestSink();//Каждому объекту  после его создания, присваивается сущность-монитор,сущность может быть только у одного потока
        // ,завладеть монитором объекта
        testSink.doWork();
           }

           public synchronized void inkrement(){//Ключевое слово синхронизирует потоки, используется для методов ,а не переменных. Выполняются по очереди.НЕ ЯВНЫЙ МЕТОД
        count++;
    }

           public void doWork() throws InterruptedException {
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    inkrement();
                }
            }
        });


        Thread thread1=new Thread(()->{
            for (int i=0;i<10;i++){
                inkrement();
            }
        });

        thread.start();
        thread1.start();

        thread.join();//Ждет когда поток полностью отработает
        thread1.join();

        System.out.println(count);
    }
}


