 import java .util.Scanner;

public class Carselector {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want a car");
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Select the type of car you want: Thar, Fortuner, BMW");
            String carType = sc.nextLine();
            String normalized = carType.toLowerCase();
            switch(normalized){
                case "thar":
                    System.out.println("You have selected a " + carType + " car.");
                    break;
                case "fortuner":
                    System.out.println("You have selected a " + carType + " car.");
                    break;
                case "bmw":
                    System.out.println("You have selected a " + carType + " car.");
                    break;
                default:
                    System.out.println("Invalid car type selected.");
            }
        }
        else{
            System.out.println("No car selected.");
        }
    }
    
}
