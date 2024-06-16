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
public class Soal4 {

    static int r, t;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int choose;
        String loop = "y";
        System.out.println("Selamat Datang");
        do {
            System.out.println("======");
            System.out.println("1. Input Nilai Radius dan Tinggi \n2. Hitung Luas dan Keliling Lingkaran");
            System.out.println("3. Hitung Volume dan Luas Permukaan Tabung \n4. Hitung Volume dan Luas Permukaan Kerucut");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan = ");
            choose = input.nextInt();

            if (choose == 1) {
                System.out.println("======");
                System.out.println("Input Nilai Radius dan Tinggi");
                System.out.print("Masukan Nilai Radius = ");
                r = input.nextInt();
                System.out.print("Masukan Nilai Tinggi = ");
                t = input.nextInt();
                System.out.println("Input Berhasil");
                check = true;
            } else if (choose == 2) {
                if (check == true) {
                    System.out.println("======");
                    System.out.println("Program Luas dan Keliling Lingkaran");
                    System.out.println("Luas Lingkaran = " + luasLing(r));
                    System.out.println("Keliling Lingkaran = " + kelLing(r));
                } else {
                    System.out.println("Anda Belum Input Radius dan Tinggi!");
                }
            } else if (choose == 3) {
                if (check == true) {
                    System.out.println("======");
                    System.out.println("Program Volume dan Luas Permukaan Tabung");
                    System.out.println("Volume Tabung = " + volTabung(r, t));
                    System.out.println("Luas Permukaan Tabung = " + luasTabung(r, t));
                } else {
                    System.out.println("Anda Belum Input Radius dan Tinggi!");
                }
            } else if (choose == 4) {
                if (check == true) {
                    System.out.println("======");
                    System.out.println("Program Volume dan Luas Permukaan Kerucut");
                    System.out.println("Volume Kerucut = " + volKerucut(r, t));
                    System.out.println("Luas Permukaan Kerucut = " + luasKerucut(r, t));
                } else {
                    System.out.println("Anda Belum Input Radius dan Tinggi!");
                }
            } else if (choose == 5) {
                System.out.println("======");
                System.out.println("Anda Keluar Dari Program");
                break;
            } else {
                System.err.println("Pilihan Tidak Tersedia!");
            }
        } while (loop.equalsIgnoreCase("y"));
    }

    public static double luasLing(double r) {
        final double PHI = 3.14;
        double hasil = PHI * r * r;
        return hasil;
    }

    public static double kelLing(double r) {
        final double PHI = 3.14;
        double hasil = 2 * PHI * r;
        return hasil;
    }

    public static double volTabung(double r, double t) {
        final double PHI = 3.14;
        double hasil = PHI * r * r * t;
        return hasil;
    }

    public static double luasTabung(double r, double t) {
        final double PHI = 3.14;
        double hasil = (2 * PHI * r * t) + (2 * r * r * PHI);
        return hasil;
    }

    public static double volKerucut(double r, double t) {
        final double PHI = 3.14;
        double hasil = PHI * r * r * t / 3;
        return hasil;
    }

    public static double luasKerucut(double r, double t) {
        final double PHI = 3.14;
        double hasil = PHI * r * (r + Math.sqrt((r * r) + (t * t)));
        return hasil;
    }
}
