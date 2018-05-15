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
public class MaleOrcString {
    
    public static void MaleNameOrc(){
                
        MaleOrc manOrc = new MaleOrc();//creates a new MaleOrc object
        
                manOrc.getLetterOne();//Gets the randomized first letter
                //then follows a specific set of rules depending on what
                //the letter is.
                if(manOrc.LetterOne < 3){// VOWELS
                    manOrc.changeLettertwoCR(1);
                    manOrc.getLettertwo();
                            if(manOrc.Lettertwo == 3){// R
                                manOrc.changeLetterthreeCR(1);//Consenant+R
                                manOrc.changeLetterfourV(1);//Vowel
                                        }
                            if(manOrc.Lettertwo > 3){// Consenant
                                manOrc.changeLetterthreeVR(1);// Vowel + R
                                manOrc.getLetterthree();
                                    if(manOrc.Letterthree < 3);// Vowel
                                        manOrc.changeLetterfourCR(1);// Consenant+R
                                    if(manOrc.Letterthree == 3);// R
                                        manOrc.changeLetterfourV(1);// Vowel
                            }
                }
                if(manOrc.LetterOne == 3){// R
                    manOrc.changeLettertwoV(1);//Vowel
                    manOrc.getLettertwo();
                        manOrc.changeLetterthreeCR(1);//Consensant+R
                        manOrc.getLetterthree();
                            if(manOrc.Letterthree == 3)
                                manOrc.changeLetterfourC(1);// Consenant
                            if(manOrc.Letterthree > 3)
                                manOrc.changeLetterfourV(1);// Vowel
                }
                if(manOrc.LetterOne > 3){// CONSENANT
                        manOrc.changeLettertwoVR(1);//Vowel+R
                        manOrc.getLettertwo();
                            if(manOrc.Lettertwo == 3){
                                manOrc.changeLetterthreeV(1);// Vowel
                                manOrc.changeLetterfourCR(1);// Consenant + R
                            }
                            if(manOrc.Lettertwo < 3){
                                manOrc.changeLetterthreeCR(1);// C + R
                                manOrc.getLetterthree();
                                    if(manOrc.Letterthree == 3)
                                        manOrc.changeLetterfourC(1);
                                    if(manOrc.Letterthree > 3)
                                        manOrc.changeLetterfourV(1);
                                
                            }
                            
                                    
                }
                    printname(manOrc);//After all the letters have been chosen
                    // somewhat randomly the name is given and it should
                    // actually look like a name with the right amount of
                    // consenants and vowels
                    

}   
    private static void printname(MaleOrc inputMaleOrc){
        System.out.print(inputMaleOrc.OrcStart.charAt(inputMaleOrc.LetterOne));
        System.out.print(inputMaleOrc.OrcStart.charAt(inputMaleOrc.Lettertwo));
        System.out.print(inputMaleOrc.OrcStart.charAt(inputMaleOrc.Letterthree));
        System.out.print(inputMaleOrc.OrcStart.charAt(inputMaleOrc.Letterfour));
        
        
}
}

    
