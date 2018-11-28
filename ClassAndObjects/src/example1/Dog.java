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
public class Dog {
    
    // every dog has 4 legs. we will create a variable that contains
    // 4 legs
    public static int no_of_legs =4;
    // every dog has a gestation period of 3 months
    public static int gestation_period = 3;
    
    public static void eatingHabits(){
        System.out.println("american dogs eat dog pellettes \n"
                + " african dogs eat ugali omena. ");
    }
    public static void barkingHabits(){
        System.out.println("all dogs bark when they see strangers");
    }
    
}
