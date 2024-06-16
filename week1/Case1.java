package week1;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, lastNumber;

        System.out.println("Welcome to the Program to Determine Odd, Even, Positive, or Negative Numbers");
        System.out.print("Enter the First Number = ");
        firstNumber = input.nextInt();
        System.out.print("Enter the Last Number = ");
        lastNumber = input.nextInt();

        while (firstNumber <= lastNumber) {
            if (firstNumber > 0) {
                if (firstNumber % 2 == 0) {
                    System.out.println(firstNumber + " => Positive Even Number");
                } else {
                    System.out.println(firstNumber + " => Positive Odd Number");
                }
            } else if (firstNumber == 0) {
                System.out.println(firstNumber + " => Zero");
            } else if (firstNumber < 0) {
                if (firstNumber % 2 == 0) {
                    System.out.println(firstNumber + " => Negative Even Number");
                } else {
                    System.out.println(firstNumber + " => Negative Odd Number");
                }
            }
            firstNumber++;
        }
    }
}
