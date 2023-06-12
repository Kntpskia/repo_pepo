package Java_2023.Coreee.Collectionss;

import java.util.ArrayList;
import java.util.List;

public class Iter {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);



        for (int x : list)  //Удалять в фор ич нельзя , из за непрределенности - что же выводить . Используется Hasnext() в цикле
            System.out.println(x);
    }
}
