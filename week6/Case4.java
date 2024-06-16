package week6;

import java.util.*;

public class Case4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfStudents;
        
        System.out.println("Welcome");

        System.out.print("Enter Number of Students = ");
        numOfStudents = input.nextInt();

        double[][] grades = new double[numOfStudents][3];
        String[] studentNames = new String[numOfStudents];
        double[] averages = new double[numOfStudents];
        double[] sums = new double[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            int studentNumber = i + 1;
            System.out.println("===");
            System.out.print("Student Name " + studentNumber + " = ");
            studentNames[i] = input.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + " Grade = ");
                grades[i][j] = input.nextDouble();

                sums[i] += grades[i][j];
            }
            averages[i] = sums[i] / 3;
        }
        System.out.println("|Name\t\t|Subject 1\t|Subject 2\t|Subject 3\t|Average");
        System.out.println("");
        for (int i = 0; i < numOfStudents; i++) {
            int studentNumber = i + 1;
            System.out.println("|" + studentNames[i] + "\t\t|" + grades[i][0] + "\t\t|" + grades[i][1] + "\t\t|" + grades[i][2] + "\t\t|" + averages[i]);
        }
    }
}
