package Java_2023.Coreee.Collectionss;

import java.util.ArrayList;
import java.util.List;

public class Arrray_List {// Iterable\Collection\List-итнтерфейс\ArrayList-класс
    public static void main(String[] args) {
        List<Integer> arrayList =new ArrayList<>(); //Только ссылочные типы
        for (int i =0;i<10;i++){
            arrayList.add(i);

        }
        System.out.println(arrayList.get(2)); //вывсети 1 элемент

        //удалить объект преносит данные на единицу  назад - презаписывает
        arrayList.remove(6);
        System.out.println(arrayList);



    }
}
