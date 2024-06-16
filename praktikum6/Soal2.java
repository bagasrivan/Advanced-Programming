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
public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        System.out.println("Selamat Datang");
        System.out.print("Masukan Jumlah Baris = ");
        baris = input.nextInt();
        System.out.print("Masukan Jumlah Kolom = ");
        kolom = input.nextInt();
        
        System.out.println("====");

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                int k = i + 1;
                int l = j + 1;
                System.out.print("Matriks A Baris " + k + " Kolom " + l + " = ");
                matriksA[i][j] = input.nextInt();
            }
        }
        System.out.println(" ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                int k = i + 1;
                int l = j + 1;
                System.out.print("Matriks B Baris " + k + " Kolom " + l + " = ");
                matriksB[i][j] = input.nextInt();
            }
        }
        int choose, choose2;
        do {
            System.out.println("\nMenu");
            System.out.println("1.Operasi Matriks \n2.Lihat Bentuk Matriks \n3.Exit");
            System.out.print("Masukan Pilihan Anda = ");
            choose = input.nextInt();

            if (choose == 1) {
                System.out.println("1.Penjumlahan \n2.Pengurangan");
                System.out.print("Masukan Pilihan Anda = ");
                choose2 = input.nextInt();

                if (choose2 == 1) {
                    System.out.println("Penjumlahan Matriks");
                    for (int i = 0; i < baris; i++) {
                        System.out.print("|");
                        for (int j = 0; j < kolom; j++) {
                            System.out.print((matriksA[i][j] + matriksB[i][j]) + " ");
                        }
                        System.out.println("|");
                    }
                } else if (choose2 == 2) {
                    System.out.println("Pengurangan Matriks");
                    for (int i = 0; i < baris; i++) {
                        System.out.print("|");
                        for (int j = 0; j < kolom; j++) {
                            System.out.print((matriksA[i][j] - matriksB[i][j]) + " ");
                        }
                        System.out.println("|");
                    }
                }
            } else if (choose == 2) {
                System.out.println("Bentuk Matriks");
                for (int i = 0; i < baris; i++) {
                    System.out.print("|");
                    for (int j = 0; j < kolom; j++) {
                        System.out.print(matriksA[i][j] + " ");
                    }
                    System.out.println("|");
                }
                System.out.println(" ");
                for (int i = 0; i < baris; i++) {
                    System.out.print("|");
                    for (int j = 0; j < kolom; j++) {
                        System.out.print(matriksB[i][j] + " ");
                    }
                    System.out.println("|");
                }
            } else if (choose == 3) {
                System.exit(0);
            }
        } while (choose != 3);
    }
}
