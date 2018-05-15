/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcNaming;

/**
 *
 * @author AlexanderIRoberts
 */

import java.util.Scanner;

public class MainOrc {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Have you ever wondered what your name would be");
        System.out.println("if you were an orc?");
        Thread.sleep(1000);// Slows it down because the computer is embarrassed.
        System.out.println("What? You haven't...?");
        System.out.println("Well here's this anyway...");
        System.out.println("Pick 1 for female and 2 for male.");
        System.out.println("Or I suppose you could enter another number to turn"
                + " this off...");
        while(true){// sets it so that the user can continue to use this
            // program until they get the exact right name.
        
        int gender = scan.nextInt();// Lets the user choose whether they
        // are going to get a lady orc name or a male orc name
        
        if(gender == 1){
            System.out.print("The name of your lady orc would be ");
            FemaleOrcString.FemaleNameOrc();// uses the method created in
            // FemaleOrcString to use the variables in FemaleOrc to create
            // a five letter name
            System.out.println("!");
            Thread.sleep(1000);
            System.out.println("If you'd like to try again Press 1.");
            System.out.println("If you'd like a male orc name press 2.");
            System.out.println("If you desperately want out of this hell press"
                    + " literally anything else.");
        }
        if(gender == 2){
            System.out.print("The name of your lady orc would be ");
            MaleOrcString.MaleNameOrc();// uses the method created in
            // MaleOrcString to use the variables in MaleOrc to create
            // a four letter name
            System.out.println("!");
            Thread.sleep(1000);
            System.out.println("If you'd like to try again press 2.");
            System.out.println("If you'd like a female orc name Press 1.");
            System.out.println("If you desperately want out of this hell press"
                    + " literally anything else");
        }
        if(gender == 0|| gender > 2){//Lets the user end the program by pressing
            //any other number
            System.out.println("Bye!");
            break;
        }
            
        
    }
    }

}
