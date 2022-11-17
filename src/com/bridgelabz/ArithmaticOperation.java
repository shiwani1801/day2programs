package com.bridgelabz;

import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        System.out.println("calculate a no.");
        Scanner sc = new Scanner(System.in);
        int function = sc.nextInt();
        System.out.println("value of a:");
        int a = sc.nextInt();
        System.out.println("value of b:");
        int b = sc.nextInt();
        System.out.println("value of c:");
        int c = sc.nextInt();

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
        //num1 = a * b + c;
        // num2 = c + a / b;
        // num3 = a % b + c;
        // num4 = a + b * c;
        if (function == 1) {
            num1 = a * b + c;
            System.out.println("num1 :" + num1);
        }
        if (function == 1) {
            num2 = c + a / b;
            System.out.println("num2 :" + num2);
        }
        if (function == 1) {
            num3 = a % b + c;

            System.out.println("num3 :" + num3);
        }
        if (function == 1) {
            num4 = a + b * c;

            System.out.println("num4 :" + num4);

        }

        if (num1 > num2 && num1 > num3 && num1 > num4) {//compare element
            System.out.println("num1 is max" + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("num2 is max" + num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("num3 is max" + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3)
            System.out.println("num4 is max" + num4);


        if (num1 < num2 && num1 < num3 && num1 < num4) {//compare element
            System.out.println("num1 is min" + num1);
        }
        else if (num2 < num1 && num2 < num3 && num2 < num4) {
            System.out.println("num2 is min" + num2);
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println("num3 is min" + num3);
        } else if (num4 < num1 && num4 < num2 && num4 < num3) {
            System.out.println("num4 is min" + num4);


        }


    }
}



