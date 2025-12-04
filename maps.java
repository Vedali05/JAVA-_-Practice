
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maps{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map cars = new HashMap();
        cars.put(1, "Toyota");
        cars.put(2, "Honda");
        cars.put(3, "Ford");
        
        System.out.println(cars);
    }
}