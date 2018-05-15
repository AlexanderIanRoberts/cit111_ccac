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
public class FemaleOrcString {
        
    public static void FemaleNameOrc(){
                
        FemaleOrc womanOrc = new FemaleOrc();//uses slightly adjusted variables
        //to from FemaleOrc to get a slightly more feminine sounding name
        //that ends in y or a using the same complicated method as MaleOrcString
        
                womanOrc.getLetterOne();
                if(womanOrc.LetterOne < 3){// VOWELS
                    womanOrc.changeLettertwoCR(1);
                    womanOrc.getLettertwo();
                            if(womanOrc.Lettertwo == 3){// R
                                womanOrc.changeLetterthreeCR(1);//Consenant+R
                                womanOrc.changeLetterfourV(1);//Vowel
                                womanOrc.yLetterfive(1);
                                        }
                            if(womanOrc.Lettertwo > 3){// Consenant
                                womanOrc.changeLetterthreeVR(1);// Vowel + R
                                womanOrc.getLetterthree();
                                    if(womanOrc.Letterthree < 3){// Vowel
                                        womanOrc.changeLetterfourCR(1);// Consenant+R
                                        womanOrc.rLetterfive(1);
                                    }
                                    if(womanOrc.Letterthree == 3){// R
                                        womanOrc.changeLetterfourV(1);// Vowel
                                        womanOrc.yLetterfive(1);
                                    }
                            }
                }
                if(womanOrc.LetterOne == 3){// R
                    womanOrc.changeLettertwoV(1);//Vowel
                    womanOrc.getLettertwo();
                        womanOrc.changeLetterthreeCR(1);//Consensant+R
                        womanOrc.getLetterthree();
                            if(womanOrc.Letterthree == 3){
                                womanOrc.changeLetterfourC(1);// Consenant
                                womanOrc.rLetterfive(1);
                            }
                            if(womanOrc.Letterthree > 3){
                                womanOrc.changeLetterfourV(1);// Vowel
                                womanOrc.yLetterfive(1);
                            }
                }
                if(womanOrc.LetterOne > 3){// CONSENANT
                        womanOrc.changeLettertwoVR(1);//Vowel+R
                        womanOrc.getLettertwo();
                            if(womanOrc.Lettertwo == 3){
                                womanOrc.changeLetterthreeV(1);// Vowel
                                womanOrc.changeLetterfourCR(1);// Consenant + R
                                womanOrc.rLetterfive(1);
                            }
                            if(womanOrc.Lettertwo < 3){
                                womanOrc.changeLetterthreeCR(1);// C + R
                                womanOrc.getLetterthree();
                                    if(womanOrc.Letterthree == 3){
                                        womanOrc.changeLetterfourC(1);
                                        womanOrc.rLetterfive(1);
                                    }
                                    if(womanOrc.Letterthree > 3){
                                        womanOrc.changeLetterfourV(1);
                                        womanOrc.yLetterfive(1);
                                    }
                                
                            }
                            
                                    
                }
                    printname(womanOrc);
                    

}   
    private static void printname(FemaleOrc inputFemaleOrc){
        System.out.print(inputFemaleOrc.OrcStart.charAt(inputFemaleOrc.LetterOne));
        System.out.print(inputFemaleOrc.OrcStart.charAt(inputFemaleOrc.Lettertwo));
        System.out.print(inputFemaleOrc.OrcStart.charAt(inputFemaleOrc.Letterthree));
        System.out.print(inputFemaleOrc.OrcStart.charAt(inputFemaleOrc.Letterfour));
        System.out.print(inputFemaleOrc.OrcEnd.charAt(inputFemaleOrc.Letterfive));
        
        
}
}
