package week6;

import java.util.*;

public class Case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows, columns, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        System.out.println("Welcome");

        System.out.print("Enter the Number of Rows = ");
        rows = input.nextInt();

        System.out.print("Enter the Number of Columns = ");
        columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int rowNumber = i + 1;
                int columnNumber = j + 1;
                System.out.print("Enter the Value for Row " + rowNumber + " and Column " + columnNumber + " = ");
                matrix[i][j] = input.nextInt();
                
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum Value = " + max);
        System.out.println("Minimum Value = " + min);
    }
}
