package week8;

import java.util.*;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString, search;

        System.out.print("Enter Input = ");
        inputString = input.nextLine();

        System.out.print("Enter Number or Letter to Search = ");
        search = input.next();

        inputString = inputString.toUpperCase();
        search = search.toUpperCase();

        String[] array = inputString.split(" ");

        sort(array);

        System.out.println("Output = ");
        print(array);

        int index = search(array, search);

        if (index != -1) {
            System.out.println(search + " Found at Index " + index + " in the Array");
        } else {
            System.out.println(search + " Not Found in the Array");
        }
    }

    public static void sort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
    }

    public static int search(String[] array, String search) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void print(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
