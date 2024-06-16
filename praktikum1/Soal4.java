package week1;

import java.util.Scanner;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.println("Welcome to the Multiplication Table Program");
        
        System.out.print("Enter a Number = ");
        number = input.nextInt();

        System.out.println("");
        System.out.print("X\t|\t");

        for (int i = 1; i <= number; i++) {
            System.out.print(i + "\t");
        }

        System.out.println(" \n ");
        System.out.println("--------------------------------------------------");

        for (int i = 1; i <= number; i++) {
            System.out.print(i + "\t|\t");
            for (int j = 1; j <= number; j++) {
                System.out.print(i * j + "\t");
            }

            System.out.println("");
        }
    }
}
