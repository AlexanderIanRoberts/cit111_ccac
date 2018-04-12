/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;

/**
 *
 * @author AlexanderIRoberts
 */
public class OrdersCompleted {
    private static int totalOrdersCompleted = 0;
    private static int totalOrdersSentBack = 0;
    
    public static void main(String[] args){
        System.out.println("Let's start the day");
        
        printOrderStats();
        
        completeOrders(7);
        failedOrders(1);
        printOrderStats();
        
        completeOrders(2);
        failedOrders(8);
        printOrderStats();

        completeOrders(9);
        failedOrders(4);
        printOrderStats();
        
    } // close main
    
    public static void completeOrders(int completed){
        
        if(completed >= 5){
            System.out.println("Killing it! Keep finding those homes!");
            System.out.println("Risk determined for " + completed + " homes.\n");
            totalOrdersCompleted = totalOrdersCompleted + completed;
        } else {
            System.out.println("Only " + completed + " homes located.");
            System.out.println("Well, that's depressing. Slow day or do people not know where they live?\n");
            totalOrdersCompleted = totalOrdersCompleted + completed;
        } // close if/else
    }// close completeOrders
    
    public static void failedOrders(int failed){
        if(failed >= 5){
            System.out.println("HOW DO PEOPLE NOT KNOW THEIR ACTUAL ADDRESS!?!");
            System.out.println(failed + " sent back to owner for more information...\n");
            totalOrdersSentBack = totalOrdersSentBack + failed;
        } else {
            System.out.println("Hey, people actually know their address!");
            System.out.println("Only " + failed + " orders sent back for more information.\n");
            totalOrdersSentBack = totalOrdersSentBack + failed;
        } // close if/else
    }// close failedOrders
    
    public static void printOrderStats(){
        
        System.out.println("*******ORDER STATS FOR THE DAY*********");
        System.out.println("Total Orders Completed: " + totalOrdersCompleted);
        System.out.println("Total Orders Sent Back to Customer: " + totalOrdersSentBack);
        System.out.println("***************************\n");
        
    }
}// close class
