/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

import java.util.*;

/**
 *
 * @author Bagaskara
 */
public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, min = 999999999, urutan = 0;
        System.out.println("Selamat Datang Pada Program Array Minimum");
        System.out.print("Masukan Panjang Array = ");
        length = input.nextInt();

        int arrayMin[] = new int[length];
        for (int i = 0; i < arrayMin.length; i++) {
            System.out.print("Array Indeks ke-" + i + " = ");
            arrayMin[i] = input.nextInt();

            if (arrayMin[i] < min) {
                min = arrayMin[i];
                urutan = i;
            }
        }
        System.out.println("Nilai Minimum Terdapat Pada Indeks ke-" + urutan + " dan Bernilai " + min);
    }
}
