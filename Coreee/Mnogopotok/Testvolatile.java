package Java_2023.Coreee.Mnogopotok;

import java.util.Scanner;

public class Testvolatile {
    public static void main(String[] args) {

        MyThread1 myThread1=new MyThread1();
        myThread1.start();

        Scanner scanner =new Scanner(System.in);
        scanner.nextLine();

        myThread1.down();

    }
}


class MyThread1 extends Thread {
    private volatile boolean running= true;//Переменная не кэшурется , а передается в главную память , у разных потоков была одна переменная

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ars");
        }
    }
    public void down(){
        this.running=false;
    }
}