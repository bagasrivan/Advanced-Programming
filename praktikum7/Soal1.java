package week7;

import java.util.*;

public class Case1 {
    
    static int rows;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Number of Rows = ");
        rows = userInput.nextInt();

        printPattern(rows, 0);
    }

    public static void printPattern(int n, int spaces) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        printStars(n);
        printPattern(n - 1, spaces + 1);
    }

    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
