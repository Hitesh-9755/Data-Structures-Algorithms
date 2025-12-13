package String;

public class StringMethod {
public static void main(String[]args){
    String s ="Hello";                                 // Using Literal
  System.out.println(s.length());               
 String sc = new  String("Ram Ram Bhaiyo");    // using new Keyword
 System.out.println(sc.length());                      // length Method 
 System.out.println(sc.charAt(2));               //  charAt used to finding char with the help of index 
System.out.println(sc.substring(2, 8));  // Substring (From beginner ,to end )
System.out.println(sc.substring(2 ));  // Substring only one index mean(show only after index char)

}    
}
