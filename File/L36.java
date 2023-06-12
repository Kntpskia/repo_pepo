package Java_2023.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L36 {
    public static void main(String[] args) throws FileNotFoundException {

        String path="C:\\Users\\Irina Kntpsk\\Desktop\\papka\\Teest.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
        String text=scanner.nextLine();
        System.out.println(text);}

        scanner.close();
    }

}
