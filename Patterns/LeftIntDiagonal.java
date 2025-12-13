
public class LeftIntDiagonal {
    public static void nNumberTriangle(int n) {
        for (int row =1;row<=n;row++){

            for(int col=n;col>=row;col--){
                System.out.print(n-col+1+" ");
            }
            System.out.println();

    }
}
public static void main(String[] args) {
    int n=5;
    nNumberTriangle(n);
}
    }