package week2;

import java.util.Scanner;

public class Case4 {
    static int r, t;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int choose;
        String loop = "y";
        
        System.out.println("Welcome");
        
        do {
            System.out.println("======");
            System.out.println("1. Input Radius and Height \n2. Calculate Area and Circumference of Circle");
            System.out.println("3. Calculate Volume and Surface Area of Cylinder \n4. Calculate Volume and Surface Area of Cone");
            System.out.println("5. Exit");
            System.out.print("Enter your choice = ");
            choose = input.nextInt();

            if (choose == 1) {
                System.out.println("======");
                System.out.println("Input Radius and Height");
                System.out.print("Enter Radius = ");
                r = input.nextInt();
                System.out.print("Enter Height = ");
                t = input.nextInt();
                System.out.println("Input Successful");
                check = true;
            } else if (choose == 2) {
                if (check) {
                    System.out.println("======");
                    System.out.println("Area and Circumference of Circle Program");
                    System.out.println("Circle Area = " + circleArea(r));
                    System.out.println("Circle Circumference = " + circleCircumference(r));
                } else {
                    System.out.println("You have not entered Radius and Height!");
                }
            } else if (choose == 3) {
                if (check) {
                    System.out.println("======");
                    System.out.println("Volume and Surface Area of Cylinder Program");
                    System.out.println("Cylinder Volume = " + cylinderVolume(r, t));
                    System.out.println("Cylinder Surface Area = " + cylinderSurfaceArea(r, t));
                } else {
                    System.out.println("You have not entered Radius and Height!");
                }
            } else if (choose == 4) {
                if (check) {
                    System.out.println("======");
                    System.out.println("Volume and Surface Area of Cone Program");
                    System.out.println("Cone Volume = " + coneVolume(r, t));
                    System.out.println("Cone Surface Area = " + coneSurfaceArea(r, t));
                } else {
                    System.out.println("You have not entered Radius and Height!");
                }
            } else if (choose == 5) {
                System.out.println("======");
                System.out.println("Exiting Program");
                break;
            } else {
                System.err.println("Invalid Choice!");
            }
        } while (loop.equalsIgnoreCase("y"));
    }

    public static double circleArea(double r) {
        final double PI = 3.14;
        double result = PI * r * r;
        return result;
    }

    public static double circleCircumference(double r) {
        final double PI = 3.14;
        double result = 2 * PI * r;
        return result;
    }

    public static double cylinderVolume(double r, double t) {
        final double PI = 3.14;
        double result = PI * r * r * t;
        return result;
    }

    public static double cylinderSurfaceArea(double r, double t) {
        final double PI = 3.14;
        double result = (2 * PI * r * t) + (2 * r * r * PI);
        return result;
    }

    public static double coneVolume(double r, double t) {
        final double PI = 3.14;
        double result = PI * r * r * t / 3;
        return result;
    }

    public static double coneSurfaceArea(double r, double t) {
        final double PI = 3.14;
        double result = PI * r * (r + Math.sqrt((r * r) + (t * t)));
        return result;
    }
}
