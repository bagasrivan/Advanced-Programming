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
public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Input = ");
        String inputS = input.nextLine().replaceAll("\\s+", "");

        ArrayList<Character> inputan = new ArrayList<>();
        for (char c : inputS.toCharArray()) {
            inputan.add(c);
        }

        int n = inputan.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                char a = inputan.get(j);
                char b = inputan.get(j + 1);
                char c;
                if (sort(a, b) > 0) {
                    c = a;
                    inputan.set(j, b);
                    inputan.set(j + 1, c);
                }
            }
        }

        System.out.println("Output After Sort = ");
        for (char d : inputan) {
            System.out.print(d);
        }

    }

    public static int sort(char a, char b) {
        if (Character.isUpperCase(a) && Character.isUpperCase(b)) {
            return a - b;
        } else if (Character.isLowerCase(a) && Character.isLowerCase(b)) {
            return a - b;
        } else if (Character.isDigit(a) && Character.isDigit(b)) {
            return a - b;
        } else if (Character.isUpperCase(a) && Character.isLowerCase(b)) {
            return -1;
        } else if (Character.isLowerCase(a) && Character.isUpperCase(b)) {
            return 1;
        } else if (Character.isLetter(a) && Character.isDigit(b)) {
            return 1;
        } else if (Character.isDigit(a) && Character.isLetter(b)) {
            return -1;
        } else {
            return 0;
        }
    }
}
