package com.bridgelabz;
import java.util.Scanner;

class NthHarmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to calculate nth harmonic number : ");
        int n = sc.nextInt();

        double add=0,i=1;

        while(i<=n){
            add = add + 1/i;
            i++;
        }

        System.out.println("Nth harmonic is : "+add);
    }
}