/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author folio
 */
public class WhileLoop {
    public static void main(String[] args){
    
        /* the syntax of writing a while loop is as
            follows
            
            startpoint;
            while(endpoint){ -> this is the control stmnt
            
                iteration; -> normally the last line of code
            }
        */
        
        
        int i =0; // starting point 
        while(i<6){ //-> ending point condition
            System.out.println("Yes");
            System.out.println(i);
            
            i++; // -> iteration
        }
    }
}
