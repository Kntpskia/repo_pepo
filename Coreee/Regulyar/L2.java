package Java_2023.Coreee.Regulyar;

import java.util.Arrays;

public class L2 {
    public static void main(String[] args) {
        //split разбивает на элементы replaceall -заменить на
        String stroka="I love Arsushu";
        String[]words=stroka.split(" ");
        System.out.println(Arrays.toString(words));
        String str= "hA ha HA Ha ";
        String mod=str.replaceAll(" ","!");// С чего На что
        System.out.println(mod);

    }
}
