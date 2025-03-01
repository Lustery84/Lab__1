package bai6__5;

import java.util.Arrays;
import java.util.Scanner;

public class bai6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] myArray;
        System.out.print("Do you want to enter the array(yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();
        if (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            System.exit(0);
        }

        if (choice.equals("yes")) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            myArray = new double[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                myArray[i] = scanner.nextDouble();
            }
        } else {
            myArray = new double[]{1789.5, 2035.75, 1899.25, 1456.0, 2013.1};
        }
        Arrays.sort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));
        double sum = 0;
        for (double num : myArray) {
            sum += num;
        }
        double average = sum / myArray.length;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}