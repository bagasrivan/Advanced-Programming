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
public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, max = -999999999, min = 999999999;
        System.out.println("Selamat Datang");

        System.out.print("Masukan Baris Matriks = ");
        baris = input.nextInt();

        System.out.print("Masukan Kolom Matriks = ");
        kolom = input.nextInt();

        int[][] matriks = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                int k = i + 1;
                int l = j + 1;
                System.out.print("Masukan Nilai Baris " + k + " dan " + l + " = ");
                matriks[i][j] = input.nextInt();
                if (matriks[i][j] > max) {
                    max = matriks[i][j];
                } else if (matriks[i][j] < min) {
                    min = matriks[i][j];
                }
            }
        }
        System.out.println("Nilai Maksimum = " + max);
        System.out.println("Nilai Minimum = " + min);
    }
}
