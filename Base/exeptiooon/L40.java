package Java_2023.Base.exeptiooon;

import java.io.FileNotFoundException;
import java.io.IOException;

public class L40 {
    public static void main(String[] args) {
        try {
            run();
        }
        catch (FileNotFoundException x){
            x.printStackTrace();// вывел ошибку
            System.out.println("Файл не найден !");
        }
        catch (IOException x){
            x.printStackTrace();// вывел ошибку

        }
        System.out.println("Start!");
    }
    public static void run() throws IOException,FileNotFoundException{}
}
