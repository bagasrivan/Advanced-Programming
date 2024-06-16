package week6;

import java.util.*;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows, columns;
        
        System.out.println("Welcome");
        
        System.out.print("Enter the Number of Rows = ");
        rows = input.nextInt();
        System.out.print("Enter the Number of Columns = ");
        columns = input.nextInt();
        
        System.out.println("====");

        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int rowNumber = i + 1;
                int columnNumber = j + 1;
                System.out.print("Matrix A Row " + rowNumber + " Column " + columnNumber + " = ");
                matrixA[i][j] = input.nextInt();
            }
        }
        System.out.println(" ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int rowNumber = i + 1;
                int columnNumber = j + 1;
                System.out.print("Matrix B Row " + rowNumber + " Column " + columnNumber + " = ");
                matrixB[i][j] = input.nextInt();
            }
        }
        int choice, operationChoice;
        
        do {
            System.out.println("\nMenu");
            System.out.println("1. Matrix Operations \n2. View Matrix Shapes \n3. Exit");
            System.out.print("Enter Your Choice = ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("1. Addition \n2. Subtraction");
                System.out.print("Enter Your Choice = ");
                operationChoice = input.nextInt();

                if (operationChoice == 1) {
                    System.out.println("Matrix Addition");
                    for (int i = 0; i < rows; i++) {
                        System.out.print("|");
                        for (int j = 0; j < columns; j++) {
                            System.out.print((matrixA[i][j] + matrixB[i][j]) + " ");
                        }
                        System.out.println("|");
                    }
                } else if (operationChoice == 2) {
                    System.out.println("Matrix Subtraction");
                    for (int i = 0; i < rows; i++) {
                        System.out.print("|");
                        for (int j = 0; j < columns; j++) {
                            System.out.print((matrixA[i][j] - matrixB[i][j]) + " ");
                        }
                        System.out.println("|");
                    }
                }
            } else if (choice == 2) {
                System.out.println("Matrix Shapes");
                System.out.println("Matrix A:");
                for (int i = 0; i < rows; i++) {
                    System.out.print("|");
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrixA[i][j] + " ");
                    }
                    System.out.println("|");
                }
                System.out.println(" ");
                System.out.println("Matrix B:");
                for (int i = 0; i < rows; i++) {
                    System.out.print("|");
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrixB[i][j] + " ");
                    }
                    System.out.println("|");
                }
            } else if (choice == 3) {
                System.exit(0);
            }
        } while (choice != 3);
    }
}
