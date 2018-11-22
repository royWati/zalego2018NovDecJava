/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements;

import java.util.Scanner;

/**
 *
 * @author folio
 */
public class SwitchStatement {
    
    // create a method that displays the gives command of a traffic
    // light signal
    /* the method switchLigh() accepts a String parameter called
        color which it uses to give the signal
    */
    public static void switchLights(String  color){
        /* 
            switch statements uses cases/ scenarios of the results
            in order to give the intended output
        */
        switch(color.toUpperCase()){
            case "GREEN" :
                System.out.println("ALL CARS GO! \n "
                        + "PEDESTRIANS STOP!!");
                break;
            /* 
                break is used in order to terminate the case
                once it has finished its execution. if not 
                added the code will execute the next case
            */  
            
            case "RED":
                System.out.println("CARS STOP! \n "
                        + "PEDESTRIANS GO!");
                break;
            /* 
                a default case is normally added to a switch
                statement in scenerios where the value to be 
                switched does not exists e.g we have 
                green and red as our values, if it happens 
                the user types yellow, we want to tell the
                user that the colour does not exists in the 
                switch statement. 
            */    
            default :
                System.out.println("colour does not exists");
                break;
        }
    }
    
    public static void main(String[] args){
        System.out.println("Enter the colour that you see "
                + "on the traffic light");
        Scanner scannerObject = new Scanner(System.in);
        String color = scannerObject.next();
        
        // we pass our colour variable as a paramater to our
        // switchLights method
        switchLights(color);
    }
}
