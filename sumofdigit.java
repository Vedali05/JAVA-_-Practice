//this program will find sum of digits of a number

import java.util.Scanner;

public class sumofdigit { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int number = sc.nextInt();
int sumOfDigits = calculateSumOfDigits(number); 
System.out.println("Sum of digits of " + number + " is: " + 
sumOfDigits); 
} 
public static int calculateSumOfDigits(int number) { 
int sum = 0; 
while (number > 0) { 
int digit = number % 10; // Extract the last digit 
sum = sum + digit; // Add the digit to sum 
number = number / 10; // Remove the last digit from number 
} 
return sum; 
} 
}