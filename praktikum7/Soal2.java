/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

import java.util.*;

/**
 *
 * @author Bagaskara
 */
public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, loop = 0;
        do {
            System.out.print("Masukan A = ");
            a = input.nextInt();
            System.out.print("Masukan B = ");
            b = input.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("Kedua Bilangan Tidak Boleh Nol");
            } else if (a < 0 || b < 0) {
                System.out.println("Kedua Bilangan Harus Positif");
            } else {
                int hasilFpb = fpb(a, b);
                System.out.println("FPB Dari " + a + " dan " + b + " Adalah = " + hasilFpb);
                loop++;
            }
        } while (loop == 0);
    }

    public static int fpb(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            if (a > b) {
                if (a % b == 0) {
                    return b;
                } else {
                    return fpb(b, a % b);
                }
            } else {
                if (b % a == 0) {
                    return a;
                } else {
                    return fpb(a, b % a);
                }
            }
        }
    }
}
