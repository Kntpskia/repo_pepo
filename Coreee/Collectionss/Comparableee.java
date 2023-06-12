package Java_2023.Coreee.Collectionss;

import java.util.*;


public class Comparableee {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        Set<Integer> set=new TreeSet<>();
        add(list);
        add(set);
        Collections.sort(list); //с заданной соритровкой
        System.out.println(list);
        System.out.println(set);//без специальной сортировки
    }
    private static void add (Collection collections){
        collections.add(new Person2("Ars",28));
        collections.add(new Person2("Irisha",21));
        collections.add(new Person2("Zero",0));


    }

}
class Person2 implements  Comparable<Person2>{
    private String str ;
    private int id;

    public Person2(String str, int id) {
        this.str = str;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "str='" + str + '\'' +
                ", id=" + id +
                '}';
    }

//Нужно для коллекции Сет  смотреть урок hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person2 person2 = (Person2) o;

        if (id != person2.id) return false;
        return str != null ? str.equals(person2.str) : person2.str == null;
    }

    @Override
    public int hashCode() {
        int result = str != null ? str.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }


//Нужен для Comparable указываем по чему сортировать объекты класса персон2
    @Override
    public int compareTo(Person2 o) {
        if (this.id > o.getId()) { //this.id -текущий элемент класса объект ,o.getId-УТОЧНИТЬ ПОЗЖЕ
            return 1;
        } else if (this.id <o.getId()){
            return -1;
        } else{
            return 0;
        }
    }
}
