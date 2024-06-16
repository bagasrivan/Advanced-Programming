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
public class Soal1 {

    static int kelipatan, length, totalKelipatan, i, total = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Pada Program Kelipatan");

        System.out.print("Masukan Panjang Array = ");
        length = input.nextInt();

        System.out.print("Masukan Kelipatan = ");
        kelipatan = input.nextInt();

        int Array[] = new int[length];
        for (int i = 0; i < length; i++) {
            Array[i] = (i + 1) * kelipatan;
            total += Array[i];
            System.out.println("Kelipatan " + kelipatan + " ke- " + i + " = " + Array[i]);
        }
        System.out.println("Total Isi Array = " + total);
    }
}
