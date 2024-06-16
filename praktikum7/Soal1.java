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
public class Soal1 {

    static int baris;

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris = ");
        baris = user.nextInt();

        print(baris, 0);
    }

    public static void print(int n, int spasi) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < spasi; i++) {
            System.out.print(" ");

        }
        print1(n);
        print(n - 1, spasi + 1);

    }

    public static void print1(int n2) {
        if (n2 <= 0) {
            return;
        }
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
