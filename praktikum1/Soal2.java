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
public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas = 1;
        System.out.println("Selamat Datang Pada Program Angka Bintang");
        System.out.print("Masukan Baris = ");
        int baris = input.nextInt();
        int tinggi = baris;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= tinggi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= alas; k++) {
                System.out.print(i);
            }
            for (int l = 1; l <= tinggi; l++) {
                System.out.print(" ");
            }
            alas += 2;
            tinggi--;
            System.out.println(" ");
        }
    }
}
