package week1;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 999999999, max = -999999999;
        int number;
        String answer = "y";
        
        System.out.println("Welcome to the Program to Find the Largest and Smallest Number");
        
        do {
            System.out.print("Enter a Number = ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            System.out.print("Do You Want to Input Another Number? (y/n)");
            answer = input.next();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("The Largest Number Entered = " + max);
        System.out.println("The Smallest Number Entered = " + min);
    }
}
