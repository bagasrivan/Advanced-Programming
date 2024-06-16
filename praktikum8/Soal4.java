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
public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toString, search;

        System.out.print("Masukan Input = ");
        toString = input.nextLine();

        System.out.print("Masukan Angka Atau Huruf Yang Dicari = ");
        search = input.next();

        toString = toString.toUpperCase();
        search = search.toUpperCase();

        String[] array = toString.split(" ");

        sort(array);

        System.out.println("Output = ");
        print(array);

        int index = search(array, search);

        if (index != -1) {
            System.out.println(search + " Ditemukan Pada Index " + index + " Dalam Array");
        } else {
            System.out.println(search + " Tidak Ditemukan Dalam Array");
        }
    }

    public static void sort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temporarry = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporarry;
                }
            }
        }
    }

    public static int search(String[] array, String search) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void print(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
