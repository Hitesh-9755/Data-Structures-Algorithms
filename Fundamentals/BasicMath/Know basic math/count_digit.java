// Count digits in a number
import java.util.Scanner;
class count_digit{
    public static void main(String[]args ){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number ");
    int n = sc.nextInt();
   int  count=0;
    while(n>0){
       n=n/10;
       count++;
    } 
    System.out.println("Total Digits is : "+count);
    }
}