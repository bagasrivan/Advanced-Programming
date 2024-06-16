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
public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("Selamat Datang Pada Program Array Fibbonaci");

        System.out.print("Masukan Panjang Bilangan Fibbonaci = ");
        length = input.nextInt();

        int arrayFibbo[] = new int[length];
        arrayFibbo[0] = 0;
        arrayFibbo[1] = 1;

        System.out.print("Deret Bilangan Fibbonaci = ");
        for (int i = 2; i < length; i++) {
            arrayFibbo[i] = arrayFibbo[i - 1] + arrayFibbo[i - 2];
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arrayFibbo[i] + " ");
        }
    }
}
