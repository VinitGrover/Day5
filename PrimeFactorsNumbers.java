package com.bridgelabz;
import java.util.Scanner;

class PrimeFactorNumbers {
    public static void main(String[] args) {
        System.out.print("Enter Number to find it's prime factors : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        while (i <= n) {

            if (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
                continue;
            }
            i++;
        }
    }
}
