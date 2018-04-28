/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feast;

/**
 *
 * @author AlexanderIRoberts
 */
public class Cereal {
    private int percRemaining = 100;
    
    private double perMilkRemaining = 100;
    
    public String flavor;
    
    public String milkType;
    
    public boolean fruit;
    
    public void simulateSpoonful(int percSpooned){
        percRemaining = percRemaining - percSpooned;
        perMilkRemaining = perMilkRemaining - (percSpooned * 0.5);
    }
    public static void fruity(boolean fruit){
        if(fruit == true)
            System.out.println("| Fruit added");
        else
            System.out.println("| No fruit");
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
    public double getPerMilkRemaining(){
        return perMilkRemaining;
    }
}
