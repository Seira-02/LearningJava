package com.sprint1;

import java.util.Arrays;
import java.util.Scanner;

public class arraySorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 1, 4, 1, 5, 9};
        Arrays.sort(arr);
        System.out.println("Sorted Array: ");
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
