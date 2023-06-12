package Java_2023.Coreee.Lyamdaaa;

interface Executable1 {
    int execute(int x);
}

class Runner1 {
    public void run(Executable1 e) {
        int a = e.execute(5);
        System.out.println(a);
    }
}


public class Lesson_1_1 {
    public static void main(String[] args) {

        Runner1 runner = new Runner1();
        runner.run(new Executable1() { //Через анонимный класс
            @Override
            public int execute(int x) {
                System.out.println("Hello from anonim klass");
                return 1;
            }
        });
        //у Лямда вырадения область видимости отсутствует
        runner.run((x) -> x+1);//5+1
        runner.run(x -> x-2);//5-2

    }
}
