class HalfDiamond{

    public static void main(String args[]){
        int n= 3;
        halfPrint(n);
    }

    public static void halfPrint(int n ){
        for(int i=1;i<=2*n-1;i++){
            int take =i;
            if(i>n) take = n-(i-n);
            
            for(int j=1;j<=take;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}