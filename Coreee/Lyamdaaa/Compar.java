package Java_2023.Coreee.Lyamdaaa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compar {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Str1ddd");
        list.add("eStr");
        list.add("Strddd");


        //Анонимный класс
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return 1;
                }
                    else if (o1.length()<o2.length()){
                        return -1;
                }
                        else
                            return 0;
            }
        });


        //Лямда
        list.sort(((o1, o2) -> { if (o1.length()>o2.length()){
            return 1;
        }
        else if (o1.length()<o2.length()){
            return -1;
        }
        else
            return 0;

        }));
        System.out.println(list);
    }
}
