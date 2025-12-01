
import java.util.Scanner;

public class swap{

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int a, b, temp;
        System.out.println("Enter the value of A:");        
        a = sc.nextInt();
        System.out.println("Enter the value of B:");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping, the value of A is :"+a);
        System.out.println("After swapping, the value of B is :"+b);
    
    }
}