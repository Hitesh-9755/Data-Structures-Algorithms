public class AlphaHill {
    public static void alphaHill(int n) {
        for(int i=1;i<=n;i++){
            char k='A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print((char)(k+j));
               }
            
               if(i>1){
                for(int j=0;j<=i-2;j++){
                    System.out.print((char)(k+j));
                }
               }
               System.out.println();
        }

    }

    public static void main(String args[]){
        int n=3;
        alphaHill(n);
    }
}