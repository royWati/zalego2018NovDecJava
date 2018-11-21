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
public class ConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("enter your maths exam marks");
         Scanner scannerObject = new Scanner(System.in);
        int marks = scannerObject.nextInt();
        // executing our if statement in the main method 
        ifStatement(marks);
        elseIfStatement(marks);
    }
    
    /* construct an if statement method
        this will demonstrate how 
        to use an if statement
    */
    
    public static void ifStatement(int marks){
        /* this method will check whether a student
            has passed his maths examination or not 
            based on the bench mark marks of 50/100
        */
       
        // use this variable to store the marks
       
       
       
        /* we need a condition to check for whether
            the marks is GREATER THAN 50
            if the mark will be greater than 50 it will
            yield a true results, if less than 50 it 
            will yield a false result
        */
        if(marks >= 50){
            // the statement returns a true value
            System.out.println("you have passed!!!");
        }else{
            // the statement returns a false value
            System.out.println("you have failed!!");
        }
        
       
       
    }
    public static void elseIfStatement(int marks){
        /* we will use else if statements 
            to grade the marks that the student 
            has 
            the marks has alot of conditions it needs
            checked before being awarded a grade. 
            hence we need to set all possible conditions
            that could be used to grade the marks
        
        */
        
        if(marks >= 80 && marks <=100){
            System.out.println("GRADE A");
        }else if(marks <= 79 && marks >=70){
            System.out.println("GRADE B");
        }else if(marks <= 69 && marks >=55){
            System.out.println("GRADE C");
        }else if(marks <= 54 && marks >=41){
            System.out.println("GRADE D");
        }else if(marks < 40 && marks >=0){
            System.out.println("GRADE E");
        }else{
            System.out.println("MARKS OUT OF RANGE!!");
        }
    }
    
}
