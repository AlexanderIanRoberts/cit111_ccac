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
public class BreakfastLand {
    final static int nibble = 5;
    final static int bite = 15;
    final static int chomp = 40;
    
    public static void main(String[] args){
        Cereal Cerealy = new Cereal();
        
        Cerealy.flavor = "chocolate";
        Cerealy.milkType = "Skim";
        Cerealy.fruit = false;
        
        
        Toast Toasty = new Toast();
        Toasty.jamType = "Raspberry";
        Toasty.butter = false;
        
        Pancakes Syrupy = new Pancakes();
        
        Syrupy.type = "Blueberry";
        Syrupy.butter = true;
        Syrupy.syrup = false;
        
        printData(Cerealy, Toasty, Syrupy);
        
        System.out.println("Alright it's breakfast time!");
        System.out.println("Munchin' some cereal!");
        System.out.println("Nibbling some toast!");
        System.out.println("Let's eat some pancakes! *chomp*");
        System.out.println("Ugh... why don't they have syrup?");
        
        Cerealy.simulateSpoonful(bite);
        Toasty.simulateBite(nibble);
        Syrupy.simulateForkful(chomp);
        
        printData(Cerealy, Toasty, Syrupy);
        
        System.out.println("I think, I'll just eat the cereal and toast...");
        System.out.println("Breaking out the megaspoon! *chomp*");
        System.out.println("This toast is going down!");
        
        Cerealy.simulateSpoonful(chomp);
        
        int numBites = 7;
        for(int i = 0; i < numBites; i++){
            System.out.println("munch munch");
            Toasty.simulateBite(bite);
        }
        
        System.out.println("Ah my hand!");
        
        printData(Cerealy, Toasty, Syrupy);

    }
    
    private static void printData(Cereal inputCereal, Toast inputToast, Pancakes inputPancakes){
        System.out.println("|-------STATS--------|");
        System.out.println("|----CEREAL STATS----|");
        System.out.println("| Cereal type: " + inputCereal.flavor);
        System.out.println("| Milk type: " + inputCereal.milkType);
        Cereal.fruity(inputCereal.fruit);
        System.out.println("| Percent Cereal Remaining: " + inputCereal.getPercRemaining());
        System.out.println("| Percent Milk Remaining: " + inputCereal.getPerMilkRemaining());
        System.out.println("|----TOAST STATS-----|");
        System.out.println("| Jam type: " + inputToast.jamType);
        Toast.buttered(inputToast.butter);
        System.out.println("| PercRemaining: " + inputToast.getPercRemaining());
        System.out.println("|-------STATS--------|");
        System.out.println("|----PANCAKE STATS----|");
        System.out.println("| Pancake type: " + inputCereal.flavor);
        Pancakes.syruped(inputPancakes.syrup);
        Pancakes.buttery(inputPancakes.butter);
        System.out.println("| Percent Pancakes Remaining: " + inputPancakes.getPercRemaining());
        System.out.println("|--------------------|");
    }
}
