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
public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Selamat Datang Pada Program Tabel Perkalian");
        System.out.print("Perkalian = ");
        angka = input.nextInt();

        System.out.println("");
        System.out.print("X\t|\t");

        for (int i = 1; i <= angka; i++) {
            System.out.print(i + "\t");
        }

        System.out.println(" \n ");
        System.out.println("--------------------------------------------------");

        for (int i = 1; i <= angka; i++) {
            System.out.print(i + "\t|\t");
            for (int j = 1; j <= angka; j++) {
                System.out.print(i * j + "\t");
            }

            System.out.println("");

        }
    }

}
