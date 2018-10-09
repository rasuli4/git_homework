package sda1.rasul;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements to scan below:");

        int amountOfElementsToScan = scanner.nextInt();                     // scan the number of digits

        if (amountOfElementsToScan <= 0) {                                  // in case number is less or equals zero, then exit the program
            System.out.println("Error! Number is '0' or less!");
            return;
        }

        int sum = 0;

        System.out.println("Enter the elements you want to sum:");

        for (int i = 0; i < amountOfElementsToScan; i++) {                  // add the scanned element to the existing sum
            sum += scanner.nextInt();
        }
        System.out.println("Sum equals: " + sum);                            // print the sum
    }
}

