package Java_2023.Base;

import java.util.Scanner;

public class A_Break_Continue {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Enter your name and age!");
        String name = vvod.nextLine();
        int age = vvod.nextInt();

            while (age<=5) {
                System.out.println("Hello! My age: " + age);
                age++;
                if (age%2 == 0)
                    age++;
                    continue;

            }
        while (age<10) {
            System.out.println("Hi! My age: " + age);
            age++;
            if (age%2 == 0)
                age++;
            break;

        }

    }
}

