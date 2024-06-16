/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal3 {

    static Scanner input = new Scanner(System.in);
    static int kelipatan, rentang;

    public static void main(String[] args) {
        main2();
        System.out.println("Kelipatan " + kelipatan + ", Dalam Rentang " + rentang + " = " + kelipatan(rentang));
    }

    public static void main2() {
        System.out.print("Masukkan Kelipatan = ");
        kelipatan = input.nextInt();
        System.out.print("Masukkan Rentang = ");
        rentang = input.nextInt();
    }

    public static String kelipatan(int rentang) {
        String b = "";
        for (int a = kelipatan; a <= rentang; a += kelipatan) {
            b += a + " ";
        }
        return b;
    }
}
