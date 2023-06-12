package Java_2023.Coreee.Regulyar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L3_Patter_Match {
    public static void main(String[] args) {
        String text="Iren.kualchek@yandex.ru Ты мой сладкий булочкин irina.kualchek@yandex.ru ";

        Pattern email=Pattern.compile("(\\w+)@(yandex.ru|gmail.com)");//Приватный коструктор ,взамен даем статический метод ,который возвращает новый объект класса

        Matcher matcher=email.matcher(text);//Ищем птаттерны в тесте
        while(matcher.find()){ //Если есть значение ,то тру - проходим цикл
            System.out.println(matcher.group());//Что нашли выводим
            System.out.println(matcher.group(1));//Что нашли до собаки -подстрока
            System.out.println("");

        }


    }
}
