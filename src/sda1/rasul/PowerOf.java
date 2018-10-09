package sda1.rasul;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values of 'a' and 'b' below:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long multiply = 1;

        if (b <= 0){                                                    // if b <= 0 then exit the program
            System.out.println("Error! B is less or equals 0:");
            return;
        }

        for (int i = 0; i < b; i++) {
            multiply *= a;
        }


        System.out.println("'a' power of 'b' = " + multiply);           // result obtained trough multiplication loop
        System.out.println();
        System.out.println("'a' power of 'b' = " + powerOf(a, b));      // result obtained by recursion method

    }

    private static long powerOf(int a, int b){                           // recursion method
        if ( b == 0 ) {
            return 1;
        }
        return ( a * powerOf(a,b-1));
    }
}
