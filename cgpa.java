

import java.util.Scanner;

public class cgpa {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of courses:");
    int x = sc.nextInt();

    double[] nbcourses = new double[x];
    double sum = 0.0;

    for(int i=0; i<nbcourses.length; i++){
        System.out.println("Enter the average for the course  "+(i+1)+":");
        nbcourses[i] = sc.nextDouble();
    }

    for(int i=0; i<nbcourses.length; i++){
    double average = nbcourses[i];
     sum = sum + nbcourses[i];
    }

    double average = sum / nbcourses.length;
    System.out.println("Your CGPA is: " + average);

    if(average >= 90){
        System.out.println("You have A grade");
    }else if(average <= 90 && average >= 80){
        System.out.println("You have B grade");
    }else if(average <= 80 && average >= 70){
        System.out.println("You have C grade");
    }else if(average <= 70 && average >= 60){
        System.out.println("You have D grade");
    }else{
        System.out.println("You have F grade");
    }

   }
   
}
