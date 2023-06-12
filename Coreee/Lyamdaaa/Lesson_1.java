package Java_2023.Coreee.Lyamdaaa;


interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}
class ExecutableImplement implements Executable {// Через интерфейс
    public void execute(){
        System.out.println("Hello from interface");
    }
}

public class Lesson_1 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplement());
        runner.run(new Executable() { //Через анонимный класс
            @Override
            public void execute() {
                System.out.println("Hello from anonim klass");
            }
        });
        runner.run(() -> {
            System.out.println("Hello from lyambda");
//В лямду можно доавить только константу + нет своей собстевнной области видимости ( т.е. доступны переменные класса )
        });

    }
}