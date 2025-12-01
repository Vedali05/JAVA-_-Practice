
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the vale of A:");
        int A = sc.nextInt();
        System.out.println("Enter the vale of B:");
        int B = sc.nextInt();


        int sum = A + B;
        
        System.out.println("The sum of a and b is: " + sum);

}
}
