package com.bridgelabz;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k;
        System.out.println("Enter a no.=");
        k = scan.nextInt();
        switch (k) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sup");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            default:
                System.out.println("dec");
        }

    }
}




