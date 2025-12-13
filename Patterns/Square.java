package Patterns;
public class Square {   // Forest Pattern 
    public static void nForest(int n) { //  n 
        for(int a=1;a<=n;a++){ // !st loop of the row 
            for(int b=1;b<=n;b++){ //  2nd Loop of the column 
                System.out.print("*"+" "); // Print The star 
            }
            System.out.println(); // New Line After each row 
        } 
    }

    public static void main(String[] args) { //Main method 
        int n=3 ; // Number of rows and columns 
        nForest(n); // call the method 
    }
}