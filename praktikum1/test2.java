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
public class test2 {
    public static void main(String[] args) {
        int outer = -4;
        while (outer < 3) { 
            int inner = 5;
            while (inner < 12) {
                System.out.println(outer + "  " + inner);
                inner++;
                outer++;
            }
        } 
    }
    
}
