package com.bridgelabz;
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Leap Year : ");
        int check = sc.nextInt();
        if (String.valueOf(check).length() != 4) {
            System.out.println("Entered year is not 4 digits");
            return;
        }
        if (check % 4 == 0 || check % 400 == 0)
            System.out.println(check + " is a leap year");
        else
            System.out.println(check + " is not a leap year");
    }
}
