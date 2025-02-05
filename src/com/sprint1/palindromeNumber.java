package com.sprint1;
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int n;
        int s=0;
        int remainder;
        n= sc.nextInt();
        int c;
        c = n;
        while(n>0){
            remainder = n%10;
            s = s*10 + remainder;
            n = n/10;
        }
        if(c==s){
            System.out.println("This is a Palindrome");
        }else{
            System.out.println("This is not a Palindrome");
        }
    }
}
