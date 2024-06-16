package week2;

import java.util.Scanner;

public class Case3 {
    static Scanner input = new Scanner(System.in);
    static int multiple, range;

    public static void main(String[] args) {
        start();
        System.out.println("Multiples of " + multiple + " Within Range " + range + " = " + findMultiples(range));
    }

    public static void start() {
        System.out.print("Enter the Multiple = ");
        multiple = input.nextInt();
        System.out.print("Enter the Range = ");
        range = input.nextInt();
    }

    public static String findMultiples(int range) {
        String result = "";
        for (int num = multiple; num <= range; num += multiple) {
            result += num + " ";
        }
        return result;
    }
}
