package week5;

import java.util.*;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        
        System.out.println("Welcome to Fibonacci Array Program");

        System.out.print("Enter the length of Fibonacci numbers = ");
        length = input.nextInt();

        int fibonacciArray[] = new int[length];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        System.out.print("Fibonacci Number Series = ");
        for (int i = 2; i < length; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        for (int i = 0; i < length; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
