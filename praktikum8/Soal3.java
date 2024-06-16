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
public class Soal3 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        boolean check = false;
        boolean end = false;

        System.out.print("Masukan Angka = ");
        String input = masuk.nextLine();

        String baru = input.replaceAll("\\s+", " ").trim();

        String[] array = baru.split(" ");

        System.out.println();

        System.out.print("Masukan Angka/Huruf Yang Ingin Dicari Indexnya = ");
        String search = masuk.nextLine();
        
        int[] data = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            char x = array[i].charAt(0);
            data[i] = (int) x;
        }

        System.out.println();

        System.out.print("Angka Sesudah Di Sort = ");
        cetak(array.length, search, data, array, check, end);
        System.out.println();
    }

    public static void cetak(int n, String search, int[] data, String[] arr, boolean check, boolean end) {
        int b = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    String s = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = s;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < search.length(); i++) {
            char c = search.charAt(i);
            if (!search.equals(arr[i])) {
                end = true;
                break;
            }
        }
        
        if (end) {
            System.out.println("\n" + search + " Tidak Ditemukan Dalam Array");
            return; 
        }
        
        for (int j = 0; j < n; j++) {
            if (search.equals(arr[j])) {
                check = true;
                b = j;
                break;
            }
        }
        
        if (check) {
            System.out.println("\n" + search + " Ditemukan Pada Indeks " + b + " Dalam Array");
            return;
        }
    }
}
