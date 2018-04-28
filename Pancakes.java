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
public class Pancakes {
    private int percRemaining = 100;
    
    public String type;
    
    public boolean butter;
    
    public boolean syrup;
    
    public void simulateForkful(int percForked){
        percRemaining = percRemaining - percForked;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
    
        public static void buttery(boolean butter){
        if(butter == true)
            System.out.println("| Buttered");
        else
            System.out.println("| Not buttered");
    }
        
            public static void syruped(boolean syrup){
        if(syrup == true)
            System.out.println("| Covered in delicious syrup");
        else
            System.out.println("| WHAT KIND OF SAVAGE HAS PANCAKES WITHOUT SYRUP?!?!");
    }
}

