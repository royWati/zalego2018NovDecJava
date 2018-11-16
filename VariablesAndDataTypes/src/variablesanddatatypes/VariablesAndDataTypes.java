
package variablesanddatatypes;

// create a new classname



public class VariablesAndDataTypes{
    /* all classes are occupied by 
        fields and methods
        field are normally variables 
    
        when creating a variable, we need to tell our complier the kind of
        data type it is suppose to store thus when compiling it know
        which data it is dealing with
    */
    
    /* creating a field of variables -> this process is called 
        variable declaration 
    */    
    static int number_one; // this is a integer variable
    static long number_long_variable; // this is a long variable
    static short number_short_variable;
    static byte number_byte_variable;
    static double number_double_variable;
    static final float number_float_variable = 3.14254565767456567f;
    static boolean bool_variable;
    static String str_variable;
    
    // create a main method
    
    public static void main(String[] args){
        // assign values/data to our variables 
        number_one = 2000;
        number_long_variable = 1000000;
        number_byte_variable = 22;
        number_double_variable = 2.397495485945495;
        
        System.out.println(bool_variable);
    }
    
}

