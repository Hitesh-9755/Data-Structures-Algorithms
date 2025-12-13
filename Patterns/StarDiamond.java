class StarDiamond{
public static void main(String[] args) {
    int n=5;
    printStarDiamond(n);
}
    
public static void printStarDiamond(int n){
    //upper part 
    for(int r = 1; r<=n;r++ ){
        for(int c = r ;c<n;c++){
              System.out.print(" ");
        
        }
        for(int c=1;c<=(2*r-1);c++){
            System.out.print("*");
        }
        System.out.println();
    }
    //Lower part 
    for(int r = 1; r<n;r++ ){
        for(int c =0 ;c<r;c++){
              System.out.print(" ");
        
        }
        for(int c=1;c<=(2*(n-r)-1);c++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    
}


}