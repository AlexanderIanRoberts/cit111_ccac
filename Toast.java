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
public class Toast {
    private int percRemaining = 100;
    
    public String jamType;
    
    public boolean butter;
    
    public void simulateBite(int percBitten){
        percRemaining = percRemaining - percBitten;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
    public static void buttered(boolean butter){
        if(butter == true)
            System.out.println("| Buttered");
        else
            System.out.println("| Not buttered");
    }
}
