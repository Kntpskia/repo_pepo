package Java_2023.Base.exeptiooon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L37 {
    public static void main(String[] args) {// относится только к текущему методу в текущем классе , наследование не затронет исключение
        try {
            File file = new File("nesushestvyu");
            Scanner scanner = new Scanner(file);
        }
        catch (FileNotFoundException x){
            x.printStackTrace();// вывел ошибку
            System.out.println("Файл не найден !");
        }
        System.out.println("Start!");
    }

    public static void game () throws FileNotFoundException {
        File file = new File("nesushestvyu");
        Scanner scanner = new Scanner(file);
    }
}
