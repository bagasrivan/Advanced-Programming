package week8;

import java.util.*;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int i = 0;

        System.out.print("Enter the Number of Data = ");
        length = input.nextInt();

        int[] array = new int[length];

        if (length <= 0) {
            System.out.println("Error!");
        } else {
            do {
                System.out.print("Enter Number " + (i + 1) + " = ");
                array[i] = input.nextInt();
                i++;
            } while (i < length);
        }

        System.out.print("Sorted Result = ");
        ascending(array);
        descending(array);

    }

    static void ascending(int[] array) {
        for (int j = 0; j < array.length / 2; j++) {
            int min = j;
            for (int k = j; k < array.length / 2; k++) {
                if (array[min] > array[k]) {
                    min = k;
                }
            }

            int temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
        for (int x = 0; x < array.length / 2; x++) {
            System.out.print(array[x] + " ");
        }
    }

    static void descending(int[] array) {
        for (int j = array.length / 2; j < array.length; j++) {
            int max = j;
            for (int k = j; k < array.length; k++) {
                if (array[max] < array[k]) {
                    max = k;
                }
            }

            int temp = array[j];
            array[j] = array[max];
            array[max] = temp;
        }
        for (int y = array.length / 2; y < array.length; y++) {
            System.out.print(array[y] + " ");
        }
    }
}
