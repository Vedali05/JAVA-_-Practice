import java.util.Scanner;
public class banana{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r,c;

        
        System.out.println("Enter the rate of Banana per dozen:");
        r=sc.nextFloat();

        c = r/12.0f;

        System.out.println("Cost of 1 Banana is :"+c);
    }
}