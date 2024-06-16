package week6;

import java.util.*;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, rightDiagonalSum = 0, leftDiagonalSum = 0;
        
        System.out.println("Welcome");
        
        System.out.print("Enter the Matrix Size = ");
        size = input.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int row = i + 1;
                int column = j + 1;
                System.out.print("Row " + row + " Column " + column + " = ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("Matrix Form");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.print("Right Diagonal = ");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
            rightDiagonalSum += matrix[i][i];
        }
        System.out.println(" ");
        System.out.print("Left Diagonal = ");
        for (int j = size; j > 0; j--) {
            System.out.print(matrix[size - j][j - 1] + " ");
            leftDiagonalSum += matrix[size - j][j - 1];
        }
        System.out.println("");
        System.out.println("Sum of Right Diagonal = " + rightDiagonalSum);
        System.out.println("Sum of Left Diagonal = " + leftDiagonalSum);
        System.out.println("Total = " + (rightDiagonalSum + leftDiagonalSum));
    }
}
