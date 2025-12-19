//sum of i to n numbers

import java.util.Scanner;

public class sum {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in,sum=0;
        System.out.println("Enter the number ");
        
        in = sc.nextInt();

        for(int i=1;i<=in;i++){
            sum = sum + i;
        }
        System.out.println("The sum is: "+sum);
    }
}
