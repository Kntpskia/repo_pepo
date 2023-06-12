package Java_2023.Coreee.Lyamdaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson_2 {
    public static void main(String[] args) {
        //Работа над коллекиями -массивами
        int[]massiv_int=new int[10]; //Задали размер массива
        List<Integer> list_int= new ArrayList<>();

        fillArray(massiv_int);
        fillList(list_int);
        System.out.println(Arrays.toString(massiv_int));
        System.out.println(list_int);
       /* for (int i=0; i<10;i++){
            massiv_int[i]=massiv_int[i]*2;
            list_int.set(1,list_int.get(i)*2);//Не работает
        }
        System.out.println(Arrays.toString(massiv_int));
        System.out.println(list_int);//Не работает */

        massiv_int=Arrays.stream(massiv_int).map(a->a*2).toArray(); //Метод мэп итреируеца по элементу (занчению ,а не идексу) //Ту эррей переводит в из типа стрим (поток) в тип массива
        list_int=list_int.stream().map(a->a*2).collect(Collectors.toList());//Ту колект переводит в из типа стрим (поток) в тип колекиции , ту лист в конкретную колекцию
        System.out.println(Arrays.toString(massiv_int));
        System.out.println(list_int);
    }

    private static void fillList(List<Integer> list_int) {
        for (int x=0;x<10;x++){
            list_int.add(x+1);
        }
    }

    private static void fillArray(int[] massiv_int) {
        for (int x=0;x<massiv_int.length;x++) {
            massiv_int[x]=x+1;

        }
    }

}
