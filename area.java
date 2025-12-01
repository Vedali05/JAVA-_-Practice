
import java.util.Scanner;

public class area{
    public static void main(String[] args) {
        
        int rad ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        rad = sc.nextInt();

        int A = (int)(3.14*(rad*rad));
        
        System.out.println("The area of circle is: " +A);

}

}
