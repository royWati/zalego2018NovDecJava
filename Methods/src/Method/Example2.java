/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author folio
 */
public class Example2 {
    
    /* 
        create a java class called Example2
        create a method called perimeter_of_a_rectangle
        prompt the user to give the length and the width then calculate 
        for him the answer and output it 
    */
    private static int perimeter_of_a_rectangle(int length,int width){
        int perimeter ;
        perimeter = 2*length + 2*width;
        perimeter = (length+width)*2;
        
        return perimeter;
    }
    //global variable pie 
    static double pie = 3.1425;
    private static double circumfrence_of_a_circle(int diameter){
        double circm ;
        circm = pie * diameter;
        return circm;
    }
    
    public static void main(String[] args){
        int perimeter;
        double circumfrence;
        
        perimeter = perimeter_of_a_rectangle(20,30);
        circumfrence = circumfrence_of_a_circle(14);
        
        System.out.println("perimeter: "+perimeter);
        System.out.println("circumfrence: "+circumfrence);
        
    }
    
}
