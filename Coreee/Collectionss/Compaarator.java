package Java_2023.Coreee.Collectionss;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compaarator {
    public static void main(String[] args) {
        List<String> arrayList =new ArrayList<>();
        arrayList.add("Ac");
        arrayList.add("Bccc");
        arrayList.add("D");
        arrayList.add("Cccc");
        Collections.sort(arrayList); //Лексикографический порядок
        System.out.println(arrayList);

        Collections.sort(arrayList,new StringLenght()); //По размеру слова
        System.out.println(arrayList);



        List<Integer> aList2= new ArrayList<>();
        aList2.add(1);
        aList2.add(3);
        aList2.add(2);
        System.out.println(aList2);
        Collections.sort(aList2, new IntgerComparator());//ПО убыванию
        System.out.println(aList2);

        //Либо создать анонимный класс

        List<Personn> personns =new ArrayList<>();

        personns.add(new Personn("Ars",28)); //создание объекта
        personns.add(new Personn("Ira",21));

        //Collections.sort(personns); не задан естественный порядок -не сработает
        System.out.println(personns);
    }


}

class StringLenght implements Comparator<String>{ //Интерефейс по сортировке коллекций
    @Override
    //Если первый объект больше второго - (1),
    // Если первый объект меньше второго - (-1), Если объекты равны - (0).


    public int compare(String o1, String o2) {
        if (o1.length()>o2.length()){
        return 1;
        }
        else if (o1.length()<o2.length()){
            return -1;
        }
        else {return 0;}
    }
}

class IntgerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer x,Integer x2){
        if (x<x2){
            return 1;
        }
        else if (x>x2){
            return -1;
        }
        else {
            return 0;
        }
    }
}
class Personn {
    private String str ;
    private int id;

    public Personn(String str, int id) {
        this.str = str;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "str='" + str + '\'' +
                ", id=" + id +
                '}';
    }
}
