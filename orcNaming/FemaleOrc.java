/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcNaming;

import java.util.Random;
/**
 *
 * @author AlexanderIRoberts
 */
public class FemaleOrc {//Ended up reusing most of MaleOrc with some adjustments
    //because I was running out of time and adjusting the letter string
    //and through off the math problems for getting vowels and consenants.
    //So as a work around I created a second letter string to pull from to add
    //to the end of the name. In hindsight I should have had seperate vowels and
    //consenants from the start...
    
        Random r = new Random();
        
        String OrcStart = "IOURDGKBP";
        
        int OSS = OrcStart.length();
        
        int LetterOne = r.nextInt(OSS-1);
        
        int Lettertwo;
        
        int Letterthree;
        
        int Letterfour;
        
        String OrcEnd = "AY";
        
        int OE = OrcEnd.length();
        
        int Letterfive = OE-1;
   
public int getLetterOne(){
    return LetterOne;
}
public int getLettertwo(){
    return Lettertwo;
}
public int getLetterthree(){
    return Letterthree;
}
public int getLetterfour(){
    return Letterfour;
}
public int getLetterfive(){
    return Letterfive;
}

public int changeLettertwoV(int Letter){
    Letter = r.nextInt(OSS-6);
    Lettertwo = Letter;
    return Lettertwo;
    
}
public int changeLettertwoC(int Letter){
    Letter = r.nextInt(OSS-4)+4;
    Lettertwo = Letter;
    return Lettertwo;
}
public int changeLettertwoCR(int Letter){
    Letter = r.nextInt(OSS-3)+3;
    Lettertwo = Letter;
    return Lettertwo;
}
public int changeLettertwoVR(int Letter){
    Letter = r.nextInt(OSS-5);
    Lettertwo = Letter;
    return Lettertwo;
}
public int changeLetterthreeV(int Letter){
    Letter = r.nextInt(OSS-6);
    Letterthree = Letter;
    return Letterthree;
    
}
public int changeLetterthreeC(int Letter){
    Letter = r.nextInt(OSS-4)+4;
    Letterthree = Letter;
    return Letterthree;
}

public int changeLetterthreeCR(int Letter){
    Letter = r.nextInt(OSS-3)+3;
    Letterthree = Letter;
    return Letterthree;
}
public int changeLetterthreeVR(int Letter){
    Letter = r.nextInt(OSS-5);
    Letterthree = Letter;
    return Letterthree;
}
public int changeLetterfourV(int Letter){
    Letter = r.nextInt(OSS-6);
    Letterfour = Letter;
    return Letterfour;
    
}
public int changeLetterfourC(int Letter){
    Letter = r.nextInt(OSS-4)+4;
    Letterfour = Letter;
    return Letterfour;
}

public int changeLetterfourCR(int Letter){
    Letter = r.nextInt(OSS-3)+3;
    Letterfour = Letter;
    return Letterfour;
}
public int changeLetterfourVR(int Letter){
    Letter = r.nextInt(OSS-5);
    Letterfour = Letter;
    return Letterfour;
} 
public int aLetterfive(int Letter){
    Letter = 0;
    Letterfive = Letter;
    return Letterfive;
}
public int yLetterfive(int Letter){
    Letter = 1;
    Letterfive = Letter;
    return Letterfive;
}
public int rLetterfive(int Letter){
    Letter = r.nextInt(OE-1);
    Letterfive = Letter;
    return Letterfive;
}
}
