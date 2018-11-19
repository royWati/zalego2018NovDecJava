/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/**
 *
 * @author folio
 */
public class example1 {
    
    // create a method called area
    // the length and the width are paremeters
    public static int area_of_a_rectangle(int length,int width){
        int area;
        // manupilation of data to achieve a certain output then store
        area = length * width;  
        
        // outputing the results of the manupilation after storing
        
        return area;
    }
    
    // main method
    public static void main(String[] args){
        
        /*
            our method returns a value for us. we need to store
            this value in variable in order to output it
            for the user. 
            we will subject our area_of_a_rectangle method
            in different scenerios
        */    
        
        // case 1
        int area; // this is the local variable that we store the vale
        area = area_of_a_rectangle(20, 32);
        System.out.println(area);
        
        // case 2
        /* we need user to give us the values and the progrm
            to calculate the result and give back
            hence we need to create 2 variables namely len,wid
            which we will use to store the values the user gives us
        
            we will need to class called Scanner to enable us 
            input data to our code
            
 
        */
           Scanner scannerObj = new Scanner(System.in);
           int len, wid;
           
    }
}
