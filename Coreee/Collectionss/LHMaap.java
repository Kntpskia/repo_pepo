package Java_2023.Coreee.Collectionss;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LHMaap {//сохраняет ключ занчение по  пряду добавления

    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();//Тип ключа и тип значения-без порядка
        Map<Integer, String> lhmap = new LinkedHashMap<>();// в каком порядке добавлены , в таком порядке вернутся
        Map<Integer, String> tmap = new TreeMap<>();//пары ключ занчения отсортированы по ключу

        //В метод testMap передали объекты map из psvm
        testMap(hmap);
        System.out.println("");
        testMap(lhmap);
        System.out.println("");
        testMap(tmap);
    }
    public static void testMap(Map <Integer,String> map){
        map.put(28,"Ars");
        map.put(21,"Irisha");
        map.put(0,"Zero");

        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }



}