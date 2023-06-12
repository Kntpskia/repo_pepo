package Java_2023.Base;
import java.util.Scanner;

public class B_Cycle {
    public static void main(String[] args){
        Scanner vvod=new Scanner (System.in);
        System.out.println("Enter your name and age!");
        String name=vvod.nextLine();
        int age=vvod.nextInt();
        switch (age){
        case 0:
            System.out.println("You was born!");
        break;}
        if (age<6) {
            while (age <= 5) {
                System.out.println("Hello! My age: " + age);
                age++;

            }
            for(int height=40;height<50;height++)
            {
                System.out.println("I am growth! My heigth is:"+height);
            }
        }
        if (age>= 5) {
                do {
                    System.out.println("Hi! My age: " + age);
                                    age++;}
            while (age >= 5 && age < 10);
            }

        else System.out.println("I am 18+!");
        System.out.println("End while!");


    }

}
