package bai6__6;

import java.util.Scanner;

public class bai6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
                if (rows > 0) {
                    break;
                } else {
                    System.out.println("Number of rows must be positive.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.exit(0);
            }
        }

        System.out.print("Enter the number of columns: ");
        int columns = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                columns = scanner.nextInt();
                if (columns > 0) {
                    break;
                } else {
                    System.out.println("Number of columns must be positive.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.exit(0);
            }
        }
        double[][] matrix1 = new double[rows][columns];
        double[][] matrix2 = new double[rows][columns];
        double[][] sumMatrix = new double[rows][columns];
        System.out.print("Do you want to enter the matrices manually? (yes/no): ");
        String choice = scanner.next().trim().toLowerCase();

        if (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            System.exit(0);
        }

        if (choice.equals("yes")) {
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    while (true) {
                        if (scanner.hasNextDouble()) {
                            matrix1[i][j] = scanner.nextDouble();
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a valid number.");
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    while (true) {
                        if (scanner.hasNextDouble()) {
                            matrix2[i][j] = scanner.nextDouble();
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter a valid number.");
                            System.exit(0);
                        }
                    }
                }
            }
        } else {
            matrix1 = new double[][]{{1.5, 2.5}, {3.5, 4.5}};
            matrix2 = new double[][]{{5.5, 6.5}, {7.5, 8.5}};
            rows = matrix1.length;
            columns = matrix1[0].length;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}