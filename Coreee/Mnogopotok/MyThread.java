package Java_2023.Coreee.Mnogopotok;

class TestThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();//СОздали новый поток ,берет код из ран и ввыполняпет его

        System.out.println("Hello, Arsik \nMarsik");

       Thread.sleep(2000);//ПРиостановить поток на 2 милисекунды

        System.out.println("Hello, Arsik \nMarsik");

        Thread thread=new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Run Marsiiiik");
        }
    }
}

public class MyThread extends Thread {//Унаследовались от калсса ПОТОК ,стали ПОТОКОМ
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Run Marsiiiik");
        }
    }
}
