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
public class test {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            for (int i2 = 1; i < 6; i2++) {
                System.out.println("i = " + i + " i2 = " + i2);
                if (i2 == 4) {
                    break;
                }
            }
            System.out.println("\n");
            if (i == 5 ) {
                break;
            }
        }
    }
}
