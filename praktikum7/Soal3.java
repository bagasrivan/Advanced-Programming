/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

import java.util.*;

/**
 *
 * @author Bagaskara
 */
public class Soal3 {

    public static void main(String[] args) {
        long angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        angka = input.nextLong();
        System.out.print("Output Reverse = ");
        reverse(angka);
    }

    public static void reverse(long angka) {
        if (angka <= 9) {
            System.out.print(angka);
        } else {
            System.out.print(angka % 10);
            reverse(angka / 10);
        }
    }
}
