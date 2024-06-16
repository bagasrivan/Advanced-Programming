/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

import java.util.*;

/**
 *
 * @author Bagaskara
 */
public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bakol, kanan = 0, kiri = 0;
        System.out.println("Selamat Datang");
        System.out.print("Masukan Jumlah Matriks = ");
        bakol = input.nextInt();

        int[][] matriks = new int[bakol][bakol];

        for (int i = 0; i < bakol; i++) {
            for (int j = 0; j < bakol; j++) {
                int k = i + 1;
                int l = j + 1;
                System.out.print("Baris " + k + " Kolom " + l + " = ");
                matriks[i][j] = input.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("Bentuk Matriks");
        for (int i = 0; i < bakol; i++) {
            for (int j = 0; j < bakol; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("Diagonal Ke Kanan = ");
        for (int i = 0; i < bakol; i++) {
            System.out.print(matriks[i][i] + " ");
            kanan += matriks[i][i];
        }
        System.out.println(" ");
        System.out.print("Diagonal Ke Kiri = ");
        for (int j = bakol; j > 0; j--) {
            System.out.print(matriks[bakol - j][j - 1] + " ");
            kiri += matriks[bakol - j][j - 1];
        }
        System.out.println("");
        System.out.println("Hasil Penjumlahan Diagonal Ke Kanan = " + kanan);
        System.out.println("Hasil Penjumlahan Diagonal Ke Kiri = " + kiri);
        System.out.println("Total = " + (kanan + kiri));
    }
}
