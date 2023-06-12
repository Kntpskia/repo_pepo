package Java_2023.Base;

import java.sql.SQLOutput;

public class H_Vlogeniy {
    private int id;


    public H_Vlogeniy(int id){
        this.id=id;
    }
    public void start()
    {
        System.out.println(id);
    }

    //НЕ статический -для ращделения на подобъекты
    private class Motor {
        public  void main(String[] args) {
            System.out.println("Brrr");
        }
    }



//Статический-получает доуступ к статическим полям и методам класса вложенный ,объединение связанных классов
private static class Fara {
    public  void main(String[] args) {
        System.out.println("Brrr");
    }
}

//Локальный класс-класс внутри методов,доступны переменные класса общ и метода
public void start1() {
        int uy=0;
    class SomeClass {
        public void someMethod() {
            System.out.println(uy);
            System.out.println(id);
        }
    }
}

}

 class Test {
     public static void main(String[] args) {
         H_Vlogeniy one21 = new H_Vlogeniy(12);
         one21.start();
        // H_Vlogeniy.Fara one2 = new H_Vlogeniy.Fara();
     }



 }