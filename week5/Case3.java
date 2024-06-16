package week5;

import java.util.*;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int plus, minus, choose, length, result;
        
        System.out.println("Welcome to Array Addition and Subtraction Program");
        
        System.out.println("Menu: \n1. Addition \n2. Subtraction");
        System.out.print("Please enter your choice = ");
        choose = input.nextInt();

        System.out.print("Enter the length of the array = ");
        length = input.nextInt();

        int arrayA[] = new int[length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Enter Array A element " + i + " = ");
            arrayA[i] = input.nextInt();
        }
        System.out.println("=========");
        int arrayB[] = new int[length];

        for (int j = 0; j < arrayB.length; j++) {
            System.out.print("Enter Array B element " + j + " = ");
            arrayB[j] = input.nextInt();
        }

        if (choose == 1) {
            System.out.println("=======");
            for (int i = 0; i < arrayA.length; i++) {
                result = arrayA[i] + arrayB[i];
                System.out.println("Result of Array element " + i + " = " + result);
            }
        } else if (choose == 2) {
            System.out.println("=======");
            for (int i = 0; i < arrayA.length; i++) {
                result = arrayA[i] - arrayB[i];
                System.out.println("Result of Array element " + i + " = " + result);
            }
        }
    }
}
