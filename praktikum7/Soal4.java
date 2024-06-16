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
public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, angka;

        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.print("Masukan Panjang Bilangan Fibbonaci = ");
        length = input.nextInt();

        for (int i = 0; i < length; i++) {
            array.add(fibbo(i));
        }

        for (int urut : array) {
            System.out.print(urut + " ");
        }

    }

    public static int fibbo(int angka) {
        if (angka <= 1) {
            return angka;
        }
        return fibbo(angka - 1) + fibbo(angka - 2);
    }
}
