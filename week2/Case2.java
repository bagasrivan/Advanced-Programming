package week2;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Addition and Subtraction Program");
        print();
    }

    public static double add() {
        Scanner input = new Scanner(System.in);
        double number1, number2, result;
        System.out.println("Addition Program");
        System.out.print("Enter the First Number = ");
        number1 = input.nextDouble();
        System.out.print("Enter the Second Number = ");
        number2 = input.nextDouble();
        result = number1 + number2;
        System.out.println("Result = " + result);
        return result;
    }

    public static double subtract() {
        Scanner input = new Scanner(System.in);
        double number1, number2, result;
        System.out.println("Subtraction Program");
        System.out.print("Enter the First Number = ");
        number1 = input.nextDouble();
        System.out.print("Enter the Second Number = ");
        number2 = input.nextDouble();
        result = number1 - number2;
        System.out.println("Result = " + result);
        return result;
    }

    public static void print() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Addition Program \n2. Subtraction Program");
        System.out.print("Enter Your Choice = ");
        int choice = input.nextInt();
        if (choice == 1) {
            add();
        } else if (choice == 2) {
            subtract();
        } else {
            System.err.println("Invalid Choice");
        }
    }
}
