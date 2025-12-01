
import java.util.Scanner;


public class minmax{

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter the value of A:");
    a = sc.nextInt();
    System.out.println("Enter the value of B:");
    b = sc.nextInt();

    if(a>b){
        System.out.println("A is maximum");
        System.out.println("B is minimum");
        
    }
    else{
        System.out.println("B is maximum");
        System.out.println("A is minimum");
    }
}
}