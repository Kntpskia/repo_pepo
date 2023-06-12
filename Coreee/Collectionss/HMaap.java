package Java_2023.Coreee.Collectionss;

import java.util.HashMap;
import java.util.Map;

public class HMaap { //отображение ключ-значения(entry) пара, беспорядочно хранятся данные из за хэширования ( превращения в биты )
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();//Тип ключа и тип значения
        hmap.put(1, "Arsic");
        hmap.put(2, "Marsic");
        System.out.println(hmap);

        //перезапись ,тк в мэп не может быть дубликатов ключей
        hmap.put(2, "Mars");
        System.out.println(hmap.get(2));

        System.out.println(hmap.get(10)); // вернет нулл




        for (Map.Entry<Integer,String> entry:hmap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }


}
