package week5;

import java.util.*;

public class Case1 {

    static int multiple, length, totalMultiples, i, total = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiples Program");

        System.out.print("Enter Array Length = ");
        length = input.nextInt();

        System.out.print("Enter Multiple = ");
        multiple = input.nextInt();

        int array[] = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (i + 1) * multiple;
            total += array[i];
            System.out.println("Multiple of " + multiple + " at index " + i + " = " + array[i]);
        }
        System.out.println("Total Array Sum = " + total);
    }
}
