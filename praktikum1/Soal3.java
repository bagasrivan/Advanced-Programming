/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 999999999, max = -999999999;
        int angka;
        String ans = "y";
        System.out.println("Selamat Datang Pada Program Nilai Terbesar dan Terkecil");
        do {
            System.out.print("Masukan Angka = ");
            angka = input.nextInt();

            if (angka > max) {
                max = angka;
            } else if (angka < min) {
                min = angka;
            }
            System.out.print("Apakah Anda Ingin Input Lagi ? (y/n)");
            ans = input.next();
        } while (ans.equalsIgnoreCase("y"));

        System.out.println("Angka Terbesar Yang Di Input = " + max);
        System.out.println("Angka Terkecil Yang Di Input = " + min);
    }
}
