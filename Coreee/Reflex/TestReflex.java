package Java_2023.Coreee.Reflex;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflex {
    public static void main(String[] args) throws ClassNotFoundException {
        Rexle rexle= new Rexle();
        Class persson1=rexle.getClass();//ПО обхекту класса рефлекс
        Class person2=Rexle.class;//Класс рефлекс  воспринимаем как обект класса КЛасс
        Class person3=Class.forName("Java_2023.Coreee.Reflex.Rexle");//ПО метсоположению класса
        Method[] methods = person2.getMethods();
        for (Method method:methods) {
            System.out.print(method.getName()+" ");

        }
        System.out.println(" ");

        Field[] fields= person2.getDeclaredFields();
        for (Field fil:fields) {
            System.out.print(fil.getName()+" ");

        }

       Annotation[] anot= person2.getAnnotations();
        for (Annotation ano:anot) {
            if (ano instanceof Autho)
            System.out.println("Yes!");

        }
    }
}
//С помощью рефлексиии мы можем создовать новые объекты класса\получить методы\конструктора  по сигнатуре ,который воспринимаем как объект