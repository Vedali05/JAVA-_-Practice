
import java.util.Scanner;

public class carcolor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] data = new String[7];
        data[0] = "Red";
        data[1] = "Blue";
        data[2] = "Black";
        data[3] = "White";
        data[4] = "Blue";
        data[5] = "Silver";
        data[6] = "Blue";

        for(int i=0; i<data.length; i++){
            if(data[i].equalsIgnoreCase("Blue"))
            System.out.println("Car number "+(i+1)+" is blue");
            else
            System.out.println("Car number "+(i+1)+" is not blue");
        }
    }   
}
