import java.util.Scanner;

class IfElse{
 
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a<25){
        System.out.println("You Failed ");
    }
    else if(a>25 || a<=50){
        System.out.println("You are Averager");
    }
    else if(a>50 || a<=100){
      System.out.println("Excellent");
    }
    else {
        System.out.println("Invalid output ");
    }
    sc.close();

 } 

}