package week5;

import java.util.*;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, min = 999999999, index = 0;
        
        System.out.println("Welcome to Minimum Array Program");
        
        System.out.print("Enter Array Length = ");
        length = input.nextInt();

        int arrayMin[] = new int[length];
        for (int i = 0; i < arrayMin.length; i++) {
            System.out.print("Array Index " + i + " = ");
            arrayMin[i] = input.nextInt();

            if (arrayMin[i] < min) {
                min = arrayMin[i];
                index = i;
            }
        }
        System.out.println("Minimum Value is found at Index " + index + " and its value is " + min);
    }
}
