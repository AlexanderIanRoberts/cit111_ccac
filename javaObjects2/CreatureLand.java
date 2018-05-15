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
public class CreatureLand {
    public static void main(String[] args){
        Creature penguin = new Creature();
        penguin.name = "Pablo";
        penguin.species = "Emperor Penguin";
        penguin.setBiteSizeInPercent(5);
        penguin.setMinDonutSizeinmm(30);
        
        SizedDonut donutForPenguin = new SizedDonut();
        
        donutForPenguin.name = "Chloe";
        donutForPenguin.sizeInmm = 32;
        
        SizedDonut donutNotForPenguin = new SizedDonut();
        
        donutNotForPenguin.name = "Howard";
        donutNotForPenguin.sizeInmm = 10;
        
        penguin.displayCreatureStats(penguin);
        donutForPenguin.displaySizedDonutStats(donutForPenguin);
        donutNotForPenguin.displaySizedDonutStats(donutNotForPenguin);
        
        penguin.eatDonut(donutForPenguin);
        penguin.eatDonut(donutNotForPenguin);
        
        penguin.displayCreatureStats(penguin);
        donutForPenguin.displaySizedDonutStats(donutForPenguin);
        donutNotForPenguin.displaySizedDonutStats(donutNotForPenguin);
        
        
    }
            
}
