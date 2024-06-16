package week2;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cube Area and Volume Program");
        menu();
        System.out.println("Thank you");
    }

    public static void area() {
        Scanner input = new Scanner(System.in);
        int side, area;
        System.out.print("Enter Cube Side Length = ");
        side = input.nextInt();
        area = 6 * side * side;
        System.out.println("Cube Area = " + area);
    }

    public static void volume() {
        Scanner input = new Scanner(System.in);
        int side, volume;
        System.out.print("Enter Cube Side Length = ");
        side = input.nextInt();
        volume = side * side * side;
        System.out.println("Cube Volume = " + volume);
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        String ans = "y";
        
        while (ans.equalsIgnoreCase("y")) {
            System.out.println("======");
            System.out.println("1. Cube Area \n2. Cube Volume");
            System.out.print("Enter Your Choice = ");
            int choose = input.nextInt();

            if (choose == 1) {
                area();
            } else if (choose == 2) {
                volume();
            } else {
                System.err.println("Invalid Choice");
            }

            System.out.println("======");
            System.out.print("Do You Want to Repeat the Program (y/n) ? = ");
            ans = input.next();
        }
    }
}
