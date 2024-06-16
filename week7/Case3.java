package week7;

import java.util.*;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;
        
        System.out.print("Enter a Number = ");
        number = input.nextLong();
        System.out.print("Reversed Output = ");
        reverse(number);
    }

    public static void reverse(long number) {
        if (number <= 9) {
            System.out.print(number);
        } else {
            System.out.print(number % 10);
            reverse(number / 10);
        }
    }
}
