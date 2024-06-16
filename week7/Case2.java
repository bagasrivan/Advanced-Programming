package week7;

import java.util.*;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, loop = 0;
        
        do {
            System.out.print("Enter A = ");
            a = input.nextInt();
            System.out.print("Enter B = ");
            b = input.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("Both Numbers Cannot Be Zero");
            } else if (a < 0 || b < 0) {
                System.out.println("Both Numbers Must Be Positive");
            } else {
                int gcdResult = gcd(a, b);
                System.out.println("GCD of " + a + " and " + b + " is = " + gcdResult);
                loop++;
            }
        } while (loop == 0);
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            if (a > b) {
                if (a % b == 0) {
                    return b;
                } else {
                    return gcd(b, a % b);
                }
            } else {
                if (b % a == 0) {
                    return a;
                } else {
                    return gcd(a, b % a);
                }
            }
        }
    }
}
