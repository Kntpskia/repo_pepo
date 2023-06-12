package Java_2023.Coreee.Collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Seeet { //Уникальное множество
    public static void main(String[] args) {
    Set<String> haSet= new HashSet<>(); //СЛучайный порядок
    Set<String> linSet= new LinkedHashSet<>();//порядок ввода
    Set<String> treeSet= new TreeSet<>(); //По возрастанию/по алфавиту
        haSet.add("Ars");
        haSet.add("Mars");

        System.out.println(haSet.contains("Ars")); //Наличие значения внутри множества тру фолс -быстро
        System.out.println(haSet.isEmpty()); //Заполенно ли множесвто - пусто ли ?

        for (String name: haSet){
            System.out.println(name);
        }

        System.out.println("");

        linSet.add("Ars");
       linSet.add("Mars");
        for (String name: linSet){
            System.out.println(name);
        }

        System.out.println("");

        treeSet.add("Ars");
        treeSet.add("Mars");
        for (String name: treeSet){
            System.out.println(name);
        }
 //объединение множеств (и то ,и то ,но все уникальное)
        Set<Integer> hSet1 = new HashSet<>();

        hSet1.add(1);
        hSet1.add(2);

        Set<Integer> hSet2 = new HashSet<>();

        hSet2.add(1);
        hSet2.add(2);
        hSet2.add(3);

        Set<Integer> set = new HashSet<>(hSet1);
        set.addAll(hSet2);
        System.out.println("Объединение "+set);

        //объединение множеств (и то ,и то ,но все уникальное)
        Set<Integer> haSet1 = new HashSet<>();

        haSet1.add(1);
        haSet1.add(2);

        Set<Integer> haSet2 = new HashSet<>();

        haSet2.add(1);
        haSet2.add(2);
        haSet2.add(3);

        Set<Integer> set2 = new HashSet<>(hSet1);
        set.retainAll(haSet2);
        System.out.println("Пересечение "+set2);

        Set<Integer> hasSet1 = new HashSet<>();

        hasSet1.add(1);
        hasSet1.add(2);
        hasSet1.add(3);

        Set<Integer> hasSet2 = new HashSet<>();

        hasSet2.add(1);
        hasSet2.add(2);


        Set<Integer> set3 = new HashSet<>(hasSet1);
        set3.removeAll(hasSet2);
        System.out.println("Разность "+set3);

    }
}

