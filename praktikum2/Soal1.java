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
public class Soal1 {

    public static void main(String[] args) {
        System.out.println("Selamat Datang Pada Program Luas dan Volume Kubus");
        menu();
        System.out.println("Terimakasih");
    }

    public static void luas() {
        Scanner input = new Scanner(System.in);
        int sisi, luas;
        System.out.print("Masukan Sisi Kubus = ");
        sisi = input.nextInt();
        luas = 6 * sisi * sisi;
        System.out.println("Luas Kubus Adalah = " + luas);
    }

    public static void volume() {
        Scanner input = new Scanner(System.in);
        int sisi, volume;
        System.out.print("Masukan Sisi Kubus = ");
        sisi = input.nextInt();
        volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus Adalah = " + volume);
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        String ans = "y";
        while (ans.equalsIgnoreCase("y")) {
            System.out.println("======");
            System.out.println("1. Luas Kubus \n2. Volume Kubus");
            System.out.print("Masukan Pilihan = ");
            int choose = input.nextInt();

            if (choose == 1) {
                luas();
            } else if (choose == 2) {
                volume();
            } else {
                System.err.println("Pilihan Tidak Tersedia");
            }

            System.out.println("======");
            System.out.print("Apakah Anda Ingin Mengulang Program (y/n) ? = ");
            ans = input.next();
        }
    }
}
