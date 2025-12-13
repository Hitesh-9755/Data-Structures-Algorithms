package basic1_input;
import java.util.Scanner;   // This is package which help to Access Class & Interface 
class ScannerClass {        // This is class and its name should be Pascel case(UpperCamelCase)

public static void main(String[]args){  
    /*  main method signature in which  
     public-> For accessing the main method anywhere 
     static -> accessing without creating object 
     void -> no return required 
     main -> Jdk already built in accessing method 
     (String args)-> for better flexibility as a input in command line 
     */
   
     Scanner sc = new Scanner(System.in); // Creating Scanner class object 
    System.out.println("Enter any number"); //
    /*  System-> built in class
        out-> instance of PrintStream for showing output 
        println-> use for passing new line /n and it is the method of PrintStream    
    */

    int a = sc.nextInt();           // method of scanner to taking input 
    System.out.println("e2e"+a);    
    sc.close();
    // sc.nextLine();
}

}