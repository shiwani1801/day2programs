package com.bridgelabz;

import java.util.Scanner;

public class ReadSingleDigitNoAndDisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k;
        System.out.println("Enter a no.=");
        {
            k = scan.nextInt();
        }

        if (k == 0) {
            System.out.println("zero");
        } else if (k == 1) {
            System.out.println("one");
        } else if (k == 2) {
            System.out.println("two");
        } else if (k == 3) {
            System.out.println("three");
        } else if (k == 4) {
            System.out.println("four");
        } else if (k == 5) {
            System.out.println("five");
        } else if (k == 6) {
            System.out.println("six");
        } else if (k == 7) {
            System.out.println("seven");
        } else if (k == 8) {
            System.out.println("eight");
        } else if (k == 9) {
            System.out.println("nine");
        }
    }
}


