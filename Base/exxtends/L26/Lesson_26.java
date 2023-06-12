package Java_2023.Base.exxtends.L26;


public class Lesson_26 {
    public static void main(String[] args) {
        Bank_Human stop =new People(); // Интерфейс ограничивает человека// Если переопределить метод в человеке .Будет метод человека-позднее связывание
        People pip= new People();
        pip.getPeople("Ars");
        pip.say();// способ 1
        outPut(pip);// способ 2
        test(pip);
    }

    public static void outPut(Bank_Human bank_human) {
        bank_human.say();

    }
    public static  void test (People people){
        people.say();
    }
}
