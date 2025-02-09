package com.sprint1;

import java.util.Scanner;

public class LargestPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine().toLowerCase();
        int start = 0;
        int end = str.length()-1;

        boolean flag = true;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                flag = false;
                break;
            }
            start ++;
            end --;
        }
        if(flag){
            System.out.println("This is a Palindrome");
        }
    }
}
