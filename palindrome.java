//this program will check whether a number is palindrome or not

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println("Palindrome Number.");


        }
        else{
            System.out.println("Not a Palindrome Number.");
        }

    }
    public static boolean isPalindrome(int num) { 
int originalNumber = num; 
int reversedNumber = 0; 
while (num != 0) { 
int digit = num % 10; 
reversedNumber = reversedNumber * 10 + digit; 
num = num/10; 
} 
return originalNumber == reversedNumber; 
} 
    
}
