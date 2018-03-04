/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
        
/**
 *
 * @author AlexanderIRoberts
 */
public class BasicMath {
    public static void main(String[] args) {
        //doubles for the correct answer and the answer given by the user.
        final double CorrectAnswer = 9;
        double answer;
        //integers for the attempts allowed and the attempt the user is on.
        final int attemptsallowed = 3;
        int attempts = 0;
        // build a scanner object
        Scanner myScanner = new Scanner(System.in);
        // prompt user and get double from them
        System.out.println("Math Test");
        // loop as long as attempts are less than attemplts allowed
        while(attempts < attemptsallowed) {
            System.out.println("What is 3 * 3?");
            // take double from the user and store it in answer
            answer = myScanner.nextDouble();
            // if answer is CorrectAnswer test complete
            if(answer == CorrectAnswer) {
                System.out.println("You are correct!");
                System.out.println("Test Complete!");
                break;
            // if answer is greater than correct answer display hint and attempts left
            } else if(answer > CorrectAnswer) {
                attempts = attempts + 1;
                System.out.println("Incorrect. Answer is a little lower than that.");
                System.out.println("Number of attempts: " + attempts);
                System.out.println("Number attempts allowed: " + attemptsallowed);
            // if answer is greater than correct answer display hint and attempts left
            } else if(answer < CorrectAnswer) {
                attempts = attempts + 1;
                System.out.println("Incorrect. Answer is a little higher than that.");
                System.out.println("Number of attempts: " + attempts);
                System.out.println("Number attempts allowed: " + attemptsallowed);
            //if attempts is equal to attempts allowed displays answer and how to get it
            } if( attempts == attemptsallowed){
            System.out.println("Test failed. The answer was 9 because 3 * 3 is equal to 3 + 3 + 3 which equals 9.");
            }
        }// close while
    }// close main
}// close class
