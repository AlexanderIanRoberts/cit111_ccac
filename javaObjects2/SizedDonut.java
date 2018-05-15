/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaObjects2;

/**
 *
 * @author AlexanderIRoberts
 */
public class SizedDonut {
    public String name;
    public int sizeInmm;
    
    private int percRemaining = 100;
    
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
    public void displaySizedDonutStats(SizedDonut sizedDonutToPrint){
        System.out.println("***Displaying SizedDonut Stats***");
        System.out.println("Name: " + sizedDonutToPrint.name);
        System.out.println("Size: " + sizedDonutToPrint.sizeInmm);
        System.out.println("Percent Remaining: " + sizedDonutToPrint.percRemaining
                + "%");
        System.out.println("*******************************");
    }
}
