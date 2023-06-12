package Java_2023.Coreee.Reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class VvodClassa {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Name 1 class");
        Class classobject=Class.forName(scanner.next());//Принмиаем на вход значение
        System.out.println("Name 2 class");
        Class classobject2=Class.forName(scanner.next());
        System.out.println("Metod 1-go class");
        String method=scanner.next();//получили название метода


        Method method1=classobject.getMethod(method,classobject2);//преременная класса метод= возываем метод гет метод .передаем в качестве перого аргумета название ,а второй агрумент предаем типы аргументов типы параметров ( мы хотим ,чтобы 2 класс был аргументов 2 )- не канон
        Object o1=classobject.newInstance();//создаем объект класса обджект ,чье название мы считали превым
        Object o2=classobject2.getConstructor(String.class).newInstance("Arsusha top");//создаем объект класса обджект ,чье название мы считали вторым с конструткорм стринг,предаем строковое значение


        method1.invoke(o1,o2);
        System.out.println(o1);

    }
}
