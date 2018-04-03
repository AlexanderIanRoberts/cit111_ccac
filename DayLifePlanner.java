/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author AlexanderIRoberts
 */
public class DayLifePlanner {
    public static void main(String[] args){
        
        Scanner keyboardScanner = new Scanner(System.in);
        
        int chosenDoor;
    
        openingStatement();
        
        
        
        chosenDoor = keyboardScanner.nextInt();
        
                
        switch(chosenDoor){
            case 1:
                doorOne();
                break;
            case 2:
                doorTwo();
                break;
            case 3:
                doorThree();
                break;
            default:
                System.out.println("Touche. Farewell!");
        
    }
}
    //This method will give the user the option to choose which type of movie they want. Unless, someone sneezes and messes up the code...
    public static void doorOne(){
        System.out.println("Time to pick a movie type! 1 are a Comedy, 2 are a Drama, 3 are a Horror, 4 are an Action, 5 are THE BEST!!!");
        Scanner keyboardScanner = new Scanner(System.in);
        
        int movieType;
        
        movieType = keyboardScanner.nextInt();
        
        System.out.println("Achew!");
        System.out.println("Oh shoot I scrambled the movies...");
        
        switch (movieType) {
            case 1:
                System.out.println("Get ready to laugh out loud because you're going to watch a... Saw?");
                break;
            case 2:
                System.out.println("It's time to get teary because you're watching a... Indiana Jones?");
                break;
            case 3:
                System.out.println("You're gonna scream your head off when you start this thrilling... Shreck?");
                break;
            case 4:
                System.out.println("My god! Look out for that boulder! This must be a... Shawshank Redemption?");
                break;
            case 5:
                System.out.println("MYSTERY SCIENCE THEATER 3000!!!");
                break;
            default:
                System.out.println("Well, look who figured out how to ruin everyone's night. Good job!");
                break;
        }
                
    }
    
    //This method randomly chooses a workout for the user to do... or not.
    public static void doorTwo(){
        
        
        Random magicNumberTwo = new Random();
        int workOutNumber = magicNumberTwo.nextInt(10);
        if (workOutNumber < 3){
            System.out.println("Throw in an 80s workout video and your most colorful sweatpants!");
        } else if(workOutNumber >= 3 || workOutNumber <= 4){
            System.out.println("Yoga time! Roll out a mat and do the stink bug!");
            System.out.println("What? Is that not a pose?");
            System.out.println("My brother is a lying jerk!");
        } else if(workOutNumber >= 5 || workOutNumber <= 6){
            System.out.println("Weights! Get big brah!");
        } else if(workOutNumber >= 7 || workOutNumber <= 8){
            System.out.println("Go for a jog. It looks lovely outside!");
            System.out.println("Unless its raining. Or snowing. Or too cold. Or too hot...");
            System.out.println("I guess there are lots of reasons not to jog, huh?");
        } else if(workOutNumber > 8){
            System.out.println("Working out is overrated.");
        }
    }
    //This method generates a random massive number to tell the user how many minutes they have until they die. A lot of users live to over a thousand apparently.
    public static void doorThree(){
        Random r = new Random();
        
        BigInteger bigInt = new BigInteger(100, r);
        
        System.out.println("My god!");
        System.out.println("You only have " + bigInt + " minutes left to live!");
        System.out.println("I'm so sorry...");
        System.out.println("Plan accordingly...");
    
        
    }
    
    public static void openingStatement(){
        
        System.out.println("***********     ***********     ***********");
        System.out.println("*         *     *         *     *         *");
        System.out.println("*   **    *     *   ***   *     *   ***   *");
        System.out.println("*  * *    *     *  *   *  *     *  *   *  *");
        System.out.println("*    *    *     *     *   *     *      *  *");
        System.out.println("*    *    *     *    *    *     *  ****   *");
        System.out.println("*    *    *     *   *     *     *      *  *");
        System.out.println("*    *    *     *  *      *     *  *   *  *");
        System.out.println("*  *****  *     *  *****  *     *   ***   *");
        System.out.println("*         *     *         *     *         *");
        System.out.println("***********     ***********     ***********");
        System.out.println(" ");
        System.out.println("Enter  Door One, Door Two, or Door Three!");
        System.out.println("One leads to fun! Two says what to do! Three says how long you'll be... ALIVE!!!");
        
    }
}
