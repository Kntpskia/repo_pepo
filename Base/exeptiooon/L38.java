package Java_2023.Base.exeptiooon;

import java.io.IOException;
import java.util.Scanner;

public class L38 {
    public static void main(String[] args) throws  IOException{
        System.out.println("Vvod:");
        Scanner scanner= new Scanner(System.in);
        while(true){
            int x=Integer.parseInt(scanner.nextLine());
            if (x!=0){
                throw new IOException();
            }
        }
    }
}
//https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html список исключений