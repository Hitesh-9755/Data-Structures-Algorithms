package Patterns;

public class RigthAngle  {
    public static void nForest(int n) {
    for(int a=1;a<=n;a++){
        for(int b=1;b<=a;b++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    }
   public static void main(String[] args) {
     int n=4;
      nForest(n);  
   }
    
}
