package Java_2023.Base;

public class I_Enum_Test {
    public static void main(String[] args) { //Тип данных Перечесления
        I_Enum cat= I_Enum.CAT;//Только укзаанные перечесления , типы другеие не подойдут ,только объект класса енам
        I_Enum Kotik= I_Enum.MAY;
        switch (Kotik){
            case CAT:
                System.out.println("I am cat!");
                break;
            case MAY:
                System.out.println("May!");
                break;
            default:
                System.out.println("I am dog!");
        }

        System.out.println(cat.getTransl());
        System.out.println(Kotik.getTransl());
    }
}

