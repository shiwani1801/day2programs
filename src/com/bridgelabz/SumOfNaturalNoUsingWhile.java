package com.bridgelabz;

public class SumOfNaturalNoUsingWhile {
    public static void main(String[] args) {
        int i=0;int sum=0;int num=6;
        while(i<=num){
            System.out.println(i);

            sum=sum+i;
            i++;

        }
        System.out.println("sum"+sum);
    }
}
