package Java_2023.Coreee.Collectionss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkeed_list_drugoe {
    public static void main(String[] args) {
        List<Integer> linkedList= new LinkedList<>();
        List<Integer> arrayList =new ArrayList<>();
        measureTime(linkedList);//Получает значения
        measureTime(arrayList);
        measureTime(linkedList);//ВОзвращает занчения
        measureTime(arrayList);

    }
    private static void measureTime (List<Integer> list){
        long start= System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            list.add(i); //Добавляет занчения
        }
        for (int i=0;i<10;i++){
            list.get(i); //Выводит значения
        }
        long end= System.currentTimeMillis();
        System.out.println(end-start);
    }
}
