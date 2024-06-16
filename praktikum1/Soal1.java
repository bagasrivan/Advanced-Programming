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
public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pertama, akhir;

        System.out.println("Selamat Datang Pada Program Menentukan Bilangan Ganjil, Genap, Positif, Negatif");
        System.out.print("Masukan Angka Pertama = ");
        pertama = input.nextInt();
        System.out.print("Masukan Angka Terakhir = ");
        akhir = input.nextInt();

        while (pertama <= akhir) {
            if (pertama > 0) {
                if (pertama % 2 == 0) {
                    System.out.println(pertama + " => Angka Positif Genap");
                } else {
                    System.out.println(pertama + " => Angka Positif Ganjil");
                }
            } else if (pertama == 0) {
                System.out.println(pertama + " => Angka 0");
            } else if (pertama < 0) {
                if (pertama % 2 == 0) {
                    System.out.println(pertama + " => Angka Negatif Genap");
                } else {
                    System.out.println(pertama + " => Angka Negatif Ganjil");
                }
            }
            pertama++;
        }
    }
}
