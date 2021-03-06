// This program finds the body mass index (BMI) for two
// individuals.  This variation includes several methods
// other than method main.

import java.util.*;

public class BadBMI {
    public static void main(String[] args) {
        System.out.println("This program reads data for one");
        System.out.println("person and computes his/her body");
        System.out.println("mass index and weight status.");
        System.out.println();
        Scanner console = new Scanner(System.in);
        person(console);
        
    }
    public static void person(Scanner console) {
    	System.out.println("Enter next person's information:");
    	System.out.print("height (in inches)? ");
    	double height = console.nextDouble();
    	getWeight(console, height);
    }
    public static void getWeight(Scanner console, double height) {
    	System.out.print("weight (in pounds)? ");
    	double weight = console.nextDouble();
    	reportStatus(console, height, weight);
    }
    public static void reportStatus(Scanner console, double height,
    	double weight) {
} }