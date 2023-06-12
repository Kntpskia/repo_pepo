package Java_2023.Coreee.Regulyar;

public class L1 {//Работа с текстом - язык описания паттернов -позволяют задать шаблон, которому должна соответствовать строка или подстрока.
    //Некоторые методы класса String принимают регулярные выражения и используют их для выполнения операций над строками.
    public static void main(String[] args) {

        // \\d-одна цифра  \\w-одна буква

        // + 1 или более

        String stroka1="1";
        System.out.println(stroka1.matches("\\d")); //Сравнение строк - одна ли цифра?
        System.out.println("");

        String stroka="-1";
        System.out.println(stroka.matches("-\\d")); //Сравнение строк - одна ли отрицательная  цифра?
        System.out.println(stroka.matches("-?\\d")); //Сравнение строк - одна  отрицательная или положительная  цифра?
        System.out.println("");

        String stroka2="+1";
       // (-|+) ОДНА ИЗ МНОЖЕСТВА
        System.out.println(stroka.matches("(-|\\+)?\\d*")); //Перевод + в специальный символ
        System.out.println("");

        //[a-zA-Z]  все буквы [0-9] все цифры [.]/все символы
        String strokStr="A123";
        System.out.println(strokStr.matches("[a-zA-Z]\\d+"));// одна буква до цифр
        System.out.println("");

        String strokStr1="Awsl123";
        System.out.println(strokStr1.matches("[a-zA-Z]+\\d+")); //Сколько угодно букв до цифр
        System.out.println("");

        String strokStr2="Awsl123";
        System.out.println(strokStr2.matches("[^w]+\\d+"));//Сколько угодно букв кроме w до цифр
        System.out.println("");


        //
        String url="http://www.google.com";

        System.out.println(url.matches("http://www\\..+\\.(ru|com)")); //\\..+\.(ru|com)- любое количесетво(+) любых символов (.)
        System.out.println(url.matches("http://www\\..+[com]"));//\\..+\.(ru|com)- любое количесетво(+) любых символов (.)
        System.out.println("");



        String number_phone="89658810435";
        System.out.println(number_phone.matches("\\d{11}"));//11 цифр

        String number_phone1="89658810435";
        System.out.println(number_phone1.matches("\\d{11,}"));//от 11 ,до бесконечности

        String number="89658810435";
        System.out.println(number.matches("\\d{6,11}"));//от 6 ,до 11

    }
}
