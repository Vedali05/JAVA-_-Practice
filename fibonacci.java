import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Number of terms :");
        int number = sc.nextInt();

        int n1 = 0, n2 = 1, next;
        System.out.println("Fibonacci Series is :");
        for(int i = 0; i <=number; i++){
            System.out.println(n1+" ");
            next = n1 + n2;
            n1 = n2;
            n2 = next;

        }

    }
}