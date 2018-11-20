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
            
 
        *//* the scanner moves line by line
            to checking if there is an input on the 
            output screen, there by storing the 
            inputs as variables
            in our case len and wid
        */
           Scanner scannerObj = new Scanner(System.in);
           int len, wid;
           // the first value will be stored as len 
           //using nextInt() method to convert from
           // string to an integer
           
           System.out.println("enter length");
           
           len = scannerObj.nextInt(); 
           
           System.out.println("enter width");
           wid = scannerObj.nextInt();
           
           // using the same area varible we created to store 
           // the answer we will get
           area = area_of_a_rectangle(len, wid);
           System.out.println("the area is "+area);
           
           
           
           
           
    }
}
