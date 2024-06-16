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
public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int plus, minus, choose, length, hasil;
        System.out.println("Selamat Datang Pada Program Tambah dan Kurang Array");
        System.out.println("Menu : \n1.Tambah \n2.Kurang");
        System.out.print("Silahkan Masukan Pilihan Anda = ");
        choose = input.nextInt();

        System.out.print("Masukan Panjang Array = ");
        length = input.nextInt();

        int arrayA[] = new int[length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Masukan Array A ke- " + i + " = ");
            arrayA[i] = input.nextInt();
        }
        System.out.println("=========");
        int arrayB[] = new int[length];

        for (int j = 0; j < arrayB.length; j++) {
            System.out.print("Masukan Array B ke- " + j + " = ");
            arrayB[j] = input.nextInt();
        }

        if (choose == 1) {
            System.out.println("=======");
            for (int i = 0; i < arrayA.length; i++) {
                hasil = arrayA[i] + arrayB[i];
                System.out.println("Hasil Array ke- " + i + " = " + hasil);
            }
        } else if (choose == 2) {
            System.out.println("=======");
            for (int i = 0; i < arrayA.length; i++) {
                hasil = arrayA[i] - arrayB[i];
                System.out.println("Hasil Array ke- " + i + " = " + hasil);
            }
        }
    }
}
