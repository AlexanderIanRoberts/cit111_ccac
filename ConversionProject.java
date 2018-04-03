/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author AlexanderIRoberts
 */
public class ConversionProject {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's figure out how fast we should go and convert miles to nautical miles!");
        System.out.println("1. Knots to travel a certain distance in a certain time?");
        System.out.println("2. Miles per hour to travel a certain distance in a certain time?");
        System.out.println("3. Miles to nautical miles.");
        System.out.println("4. Nautical miles to miles.");

        System.out.println("1. How many days would you like your trip to take?");
        double userDays = scan.nextDouble();

        System.out.println("How many nautical miles will you be traveling?");
        double userNMiles = scan.nextDouble();

        double knots = knotsCalc(userDays,userNMiles);

        System.out.println("If we want to travel " + userNMiles + " nautical miles in " + userDays);
        System.out.println("days we'll need to be going an average speed of " + knots + " knots.");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-");

        System.out.println("2. How many hours would you like your trip to take?");
        double userHours = scan.nextDouble();

        System.out.println("How many miles will you be driving?");
        double userMiles = scan.nextDouble();

        double mph = mphCalc(userHours,userMiles);

        System.out.println("If we want to drive " + userMiles + " miles in " + userHours + " hours we");
        System.out.println(" should drive at an average speed of " + mph + " miles per hour.");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-");
        
        System.out.println("3. Let's convert miles to nautical miles.");
        System.out.println("You know, in case the land turns to water on the journey.");
        System.out.println("How many miles are we converting?");
        double userConvertableMiles = scan.nextDouble();
        
        double conNM = milesToNautMilesCalc(userConvertableMiles);
        
        System.out.println("There are " + conNM + " nautical miles in " + userConvertableMiles + " miles.");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-");
        
        System.out.println("4. Let's convert nautical miles to miles.");
        System.out.println("In case the sea freezes, I guess.");
        System.out.println("How many nautical miles are we converting?");
        double userConNautMiles = scan.nextDouble();
        
        double conMiles = nMilesToMilesConverter(userConNautMiles);
        
        System.out.println("There are " + conMiles + " nautical miles in " + userConNautMiles + " miles.");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-");

    }// End Main
        
    /**
     * Calculates the average knots for a trip with given days and distance
     * @param days for the trip
     * @param distance for the trip
     * @return the average knots for the trip
     */
    public static double knotsCalc(double days, double distance){
            
            double knots = distance / (24 * days);
            
            return knots;
            
        
    }// End knotsCalc
    
 public static double mphCalc(double hours, double miles){
            
            double mph = miles / hours;
            
            return mph;
    }// End mphCalc
 
 public static double milesToNautMilesCalc(double miles){
     double conNM = miles * 0.868976;
     
     return conNM;
 }
 
 public static double nMilesToMilesConverter(double nmiles){
     double conMiles = nmiles * 1.15078;
     
     return conMiles;
 }// End nMilesToMilesConverter

} // End Class
