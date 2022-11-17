package com.bridgelabz;

import java.util.Scanner;

public class ReadNumberAndDisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a no.=");
        int k = scan.nextInt();

        if (k == 1) {
            System.out.println("one");
        }
        else if(k == 10){
            System.out.println("ten");
        }
        else if(k == 100)
        {
            System.out.println("hundred");
        }
        else if(k == 1000){
            System.out.println("thausand");
        }
    }
}


