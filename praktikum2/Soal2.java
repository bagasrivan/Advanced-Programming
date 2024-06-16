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
public class Soal2 {

    public static void main(String[] args) {
        System.out.println("Selamat Datang Pada Program Tambah dan Kurang");
        print();
    }

    public static double tambah() {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        System.out.println("Program Tambah");
        System.out.print("Masukan Angka Pertama = ");
        angka1 = input.nextDouble();
        System.out.print("Masukan Angka Kedua = ");
        angka2 = input.nextDouble();
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);
        return hasil;
    }

    public static double kurang() {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        System.out.println("Program Kurang");
        System.out.print("Masukan Angka Pertama = ");
        angka1 = input.nextDouble();
        System.out.print("Masukan Angka Kedua = ");
        angka2 = input.nextDouble();
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);
        return hasil;
    }

    public static void print() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Program Tambah \n2. Program Kurang");
        System.out.print("Masukan Pilihan = ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            tambah();
        } else if (pilihan == 2) {
            kurang();
        } else {
            System.err.println("Pilihan Tidak Tersedia");
        }
    }
}
