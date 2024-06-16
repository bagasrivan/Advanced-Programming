package week8;

import java.util.*;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        boolean end = false;

        System.out.print("Enter Numbers = ");
        String inputStr = input.nextLine();

        String cleanedInput = inputStr.replaceAll("\\s+", " ").trim();

        String[] array = cleanedInput.split(" ");

        System.out.println();

        System.out.print("Enter Number/Letter to Search Index = ");
        String search = input.nextLine();
        
        int[] data = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            char x = array[i].charAt(0);
            data[i] = (int) x;
        }

        System.out.println();

        System.out.print("Numbers After Sorting = ");
        printSorted(array.length, search, data, array, check, end);
        System.out.println();
    }

    public static void printSorted(int n, String search, int[] data, String[] arr, boolean check, boolean end) {
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    String tempStr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempStr;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < search.length(); i++) {
            char c = search.charAt(i);
            if (!search.equals(arr[i])) {
                end = true;
                break;
            }
        }
        
        if (end) {
            System.out.println("\n" + search + " Not Found in the Array");
            return; 
        }
        
        for (int j = 0; j < n; j++) {
            if (search.equals(arr[j])) {
                check = true;
                index = j;
                break;
            }
        }
        
        if (check) {
            System.out.println("\n" + search + " Found at Index " + index + " in the Array");
            return;
        }
    }
}
