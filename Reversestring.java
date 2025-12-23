//This program will Reverse a String

import java.util.Scanner;

public class Reversestring{

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the String :");
        String input = sc.nextLine();
        char ch;
        String nstr = " ";

        for (int i = 0; i <input.length(); i++){
            ch = input.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reverdes String is :" +nstr);


    }
}