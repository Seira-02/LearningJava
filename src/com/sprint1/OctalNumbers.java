package com.sprint1;

import java.util.Scanner;
public class OctalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number here: ");
        int num, d;
        num = sc.nextInt();
        boolean flag =true;
        while(num>0){
            d = num%10;
            if(d>7){
                flag = false;
                break;
            }
            num = num/10;
        }
        if(flag){
            System.out.println("This number is octal");
        }else{
            System.out.println("This is not an octal number");
        }


    }
}
