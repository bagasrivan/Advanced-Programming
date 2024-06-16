package week1;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = 1;
        
        System.out.println("Welcome to the Number Star Program");
        System.out.print("Enter the Number of Rows = ");
        int rows = input.nextInt();
        int height = rows;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= base; k++) {
                System.out.print(i);
            }
            for (int l = 1; l <= height; l++) {
                System.out.print(" ");
            }
            base += 2;
            height--;
            System.out.println(" ");
        }
    }
}
