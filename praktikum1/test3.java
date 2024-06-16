/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author Bagaskara
 */
public class test3 {
    public static void main(String[] args) {
        int i = 1;
        do {
            int k = 3;
            do {
                System.out.println("  ");
                k--;
            } while (k >= i);
            int j = 1;
            do {
                System.out.println(i + " ");
                j++;
            } while (j <= i);
            System.out.println(""); i++;
        } while (i <= 5);
    }
}
