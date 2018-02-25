/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasproject;

import java.util.Scanner;
/**
 *
 * @author AlexanderIRoberts
 */
public class RoadTrip {
    public static void main(String[] args) {
        
        //these values are the gallons of gas and the miles left to drive
        double gas;
        double miles;
        
        // creates a scanner object to get values
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for amount of gas
        System.out.println("Are we gonna have to walk? Because I'm wearing flip flops...");
        
        System.out.println("How many gallons of gas are in the tank?");
        
        //reads what the user typed into the variable for gas
        gas = userInputScanner.nextDouble();
        
        // prompt the user for miles to go
        System.out.println("How many miles are we from the gas station?");
        
        // read what the use typed into the variable for miles
        miles = userInputScanner.nextDouble();
        
        // compares the user entered amount of gas to the amount needed to finish the trip
        if (gas * 28 >= miles){
            System.out.println("Phew! We're good.");
        } else {
            System.out.println("This is the end...");
        } // closes if/else block
        
    } // close main method
} // cose class DoIHaveEnoughGas
