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
public class MaleOrc {
        Random r = new Random();
        
        String OrcStart = "IOURDGKBP";//This is the string of harsh sounding
        //letters I decided would go together well for a name.
        
        int OSS = OrcStart.length();// This measures the length of the string
        //So that the string can be changed without the characters coming out
        //wonky when printed
        
        int LetterOne = r.nextInt(OSS-1);//This picks a random number that
        // corresponds to a letter in the OrcStart string. It has to subtract
        // 1 because when choosing a character later the letters start at 0
        // rather than one
        
        int Lettertwo;// these ints correspond to the letters
        // in the OrcStart string as well.
        
        int Letterthree;
        
        int Letterfour;

        
public int getLetterOne(){// these call up the ints after they have
    // been properly randomized according to their specific methods
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

public int changeLettertwoV(int Letter){// I attempted a number of different
    // versions of methods and ints, but struggled to make a universal method
    // to randomize any letter value put in and return it properly. So, I simply
    // created an int for each letter.
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

}
