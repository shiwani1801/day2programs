package com.bridgelabz;

public class RootOfEquation {
    public static void main(String[] args) {
        double a = -2, b = 8, c = 5, delta;
        double root1, root2;

        delta = b * b - 4 * a * c;
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("root1and root2=" + root1 + " and " + root2);
        } else if (delta == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("root1=root;" + root1);
        } else {
            //delta<0
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.println(" root1 = " + real + " and " + imaginary);
            System.out.println("\nroot2 =" + real + " and " + imaginary);

        }
    }
}
