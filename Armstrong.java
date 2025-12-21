
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arm = 0, a, b, d, no;

        System.out.println("Enter any NUmber :");
        no = sc.nextInt();
        d = no;
        while(no>0){
            a = no%10;
            no = no/10;
            arm = arm + a*a*a;

        }

        if(arm == d){
            System.out.println("Armstrong Number");

        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    
}
