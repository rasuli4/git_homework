package sda1.rasul;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers below:");

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("Sum equals " + sum);
    }
}
