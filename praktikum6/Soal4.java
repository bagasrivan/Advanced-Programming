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
public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMhs;
        System.out.println("Selamat Datang");

        System.out.print("Masukan Jumlah Mahasiswa = ");
        jmlMhs = input.nextInt();

        double[][] nilai = new double[3][3];
        int[] mahasiswa = new int[jmlMhs];
        String[] nama = new String[jmlMhs];
        double[] rerata = new double[jmlMhs];
        double[] jumlah = new double[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            int k = i + 1;
            System.out.println("===");
            System.out.print("Nama Mhs " + k + " = ");
            nama[i] = input.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + " = ");
                nilai[i][j] = input.nextDouble();

                jumlah[i] += nilai[i][j];
            }
            rerata[i] = jumlah[i] / 3;
        }
        System.out.println("|Nama\t\t|Matkul1\t|Matkul2\t|Matkul3\t|Rata-Rata");
        System.out.println("");
        for (int i = 0; i < jmlMhs; i++) {
            int k = i + 1;
            System.out.println("|" + nama[i] + "\t\t|" + nilai[i][0] + "\t\t|" + nilai[i][1] + "\t\t|" + nilai[i][2] + "\t\t|" + rerata[i]);
        }
    }
}
