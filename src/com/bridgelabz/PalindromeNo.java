package com.bridgelabz;

public class PalindromeNo {
    public static void main(String[] args) {
        int num=242;
        int reverse=0;
        int original=num;
        for(;num!=0;num=num/10){
            int  remainder=num%10;
            reverse=reverse*10+remainder;
        }
        if(original==reverse){
            System.out.println("no.is palindrome:"+original);
        }else {
            System.out.println("no. is not palindrome:"+original);
        }

    }
}
