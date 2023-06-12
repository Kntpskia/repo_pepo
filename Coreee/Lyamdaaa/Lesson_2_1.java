package Java_2023.Coreee.Lyamdaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson_2_1 {

    public static void main(String[] args) {
        //Работа над коллекиями -массивами
        int[]massiv_int=new int[10]; //Задали размер массива
        List<Integer> list_int= new ArrayList<>();

        fillArray(massiv_int);
        fillList(list_int);
        System.out.println(Arrays.toString(massiv_int));
        System.out.println(list_int);
       //Метод Мэп сопоставляет данные ,рабоаетт с нимии ( менет значения)
        massiv_int=Arrays.stream(massiv_int).map(a->3).toArray();

        //Метод фильтр-соотвествует ли нашему элементу ? Тру\фолс
        int[]arr =new int[10];
        List<Integer> list =new ArrayList<>();

        fillArray(arr);
        fillList(list);
//Водвоим методом фор ич массив
        Arrays.stream(arr).forEach(a-> System.out.print(a));
        System.out.println("");
        list.stream().forEach(a-> System.out.print(a));
        System.out.println("");

        arr=Arrays.stream(arr).filter(a->a%2==0).toArray();
        System.out.println(Arrays.toString(arr));

        list=list.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(list);





        int[]arr1 =new int[10];
        List<Integer> list1 =new ArrayList<>();
        fillArray(arr1);
        fillList(list1);
        //Редьюс метод -уменьшает в один элемент
        int sum_arr= Arrays.stream(arr1).reduce((acc,b)->acc+b).getAsInt();//acc= первому значению массива ,b текущее втрое значение в массива, Сумма всех чисел
        int sum_arr1= Arrays.stream(arr1).reduce(0,(acc,b)->acc+b);//acc= первому значению 0 ,которое мы задали ,b текущее(первое  занчение)  Сумма всех чисел
        int sum_list=list.stream().reduce((acc,b)->acc*b).get();//Произведение первого и следующего числа , ацц - произведение предудущех чисел, б следующее число массива
        System.out.println(sum_arr);
        System.out.println(sum_arr1);
        System.out.println(sum_list);







    }

    //Заполенние массивов
    private static void fillList(List<Integer> list) {
        for (int x=0;x<10;x++){
            list.add(x+1);
        }
    }

    private static void fillArray(int[] arr) {
        for (int x=0;x<arr.length;x++) {
            arr[x]=x+1;

        }
    }
}
