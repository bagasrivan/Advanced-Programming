/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum8;

import java.util.*;

/**
 *
 * @author Bagaskara
 */
public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int i = 0;

        System.out.print("Masukan Jumlah Data = ");
        length = input.nextInt();

        int[] array = new int[length];

        if (length <= 0) {
            System.out.println("Error!");
        } else {
            do {
                System.out.print("Masukan Angka ke-" + (i + 1) + " = ");
                array[i] = input.nextInt();
                i++;
            } while (i < length);
        }

        System.out.print("Hasil Pengurutan = ");
        asc(array);
        dsc(array);

    }

    static void asc(int[] array) {
        for (int j = 0; j < array.length / 2; j++) {
            int min = j;
            for (int k = j; k < array.length / 2; k++) {
                if (array[min] < array[k]) {
                    min = k;
                }
            }

            int temporarry = array[j];
            array[j] = array[min];
            array[min] = temporarry;

        }
        for (int x = 0; x < array.length / 2; x++) {
            System.out.print(array[x] + " ");
        }
    }

    static void dsc(int[] array) {
        for (int j = array.length / 2; j < array.length; j++) {
            int min = j;
            for (int k = j; k < array.length; k++) {
                if (array[min] > array[k]) {
                    min = k;
                }
            }

            int temporarry = array[j];
            array[j] = array[min];
            array[min] = temporarry;

        }
        for (int y = array.length / 2; y < array.length; y++) {
            System.out.print(array[y] + " ");
        }
    }
}
