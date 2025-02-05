package com.sprint1;
import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;



        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);


            if(ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } 

        }
        System.out.println("Vowel count: " +vowelCount);
        System.out.print("Consonant Count: " +consonantCount);
    }
}
