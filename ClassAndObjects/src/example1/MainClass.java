/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author folio
 */
public class MainClass {
    /* an object behaves the same way as a variable. you can 
        either create a global object or a local object.
    */
    public static void main(String[] args){
        // creating an object of the class dog.
        Dog dogObject = new Dog();
       
        
        /*the dogObject is an object of the class dog. hence 
            we create a new instance of the Dog class using 
            new Dog();
        */
        
        dogObject.eatingHabits();
    }
}
