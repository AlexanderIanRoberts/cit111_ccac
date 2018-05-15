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
public class Creature {
    //public member variables
    public String name;
    public String species;
    private int biteSizeInPercent;
    private int minDonutSize;
    public void eatDonut(SizedDonut donutToEat){
        if(donutToEat.sizeInmm >= minDonutSize){
        donutToEat.simulateEating(biteSizeInPercent);
        System.out.println(name + " nibbles away at " + donutToEat.name + "!");
        }else{
            System.out.println(name + " stares at " + donutToEat.name + " with "
                    + "disdain.");
            System.out.println("This donut is too small for a penguin that is also an emperor!");
        }
    }
    
    public int getBiteSizeInPercent(){
        return biteSizeInPercent;
    }
    public int getMinDonutSize(){
        return minDonutSize;
    }
    public void setBiteSizeInPercent(int sizeToSet){
        if(sizeToSet > 0){
        this.biteSizeInPercent = sizeToSet;
        }
        else{
            System.out.println("SizedDonut.setBiteSizeInPercent |"
                    + "Ooops, negative values not allowed!");
        }
    }
    public void setMinDonutSizeinmm(int donutSize){
        if(donutSize > 0){
        this.minDonutSize = donutSize;
        }else{
            System.out.println("Sorry you can't eat a donut that doesn't exist.");
        }
    }
    
    public void displayCreatureStats(Creature creatureToPrint){
        System.out.println("***Displaying Creature Stats***");
        System.out.println("Name: " + creatureToPrint.name);
        System.out.println("Species: " + creatureToPrint.species);
        System.out.println("Bite Size: " + creatureToPrint.getBiteSizeInPercent()
            + "% of a donut");
        System.out.println("*******************************");
    }

}
