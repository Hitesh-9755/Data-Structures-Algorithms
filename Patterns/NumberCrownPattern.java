class NumberCrownPattern{

    public static void main(String args[]){
        int n= 5;
        crownPrint(n);
    }
    public static void crownPrint(int n ){

        for(int r=1,k=2;r<=n;r++,k=k+2){

            for(int c=1;c<=r;c++){
                System.out.print(c);
            }
           
            for(int c=1;c<=(2*n)-k;c++){
                System.out.print(" ");


            }
        
            for(int c = r;c>0;c--){
                System.out.print(c);
            }
            System.out.println();
        }
    }

}