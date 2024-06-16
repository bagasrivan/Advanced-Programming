package week7;

import java.util.*;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, number;

        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.print("Enter the Length of Fibonacci Sequence = ");
        length = input.nextInt();

        for (int i = 0; i < length; i++) {
            array.add(fibonacci(i));
        }

        System.out.print("Fibonacci Sequence: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
