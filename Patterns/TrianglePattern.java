

public class TrianglePattern { // class which is public 
    public static void nTriangle(int n) { // main method 
    for(int row=1;row<=n;row++){         // outer loop which is use for row 
       for(int col=1;col<=row;col++){    // Inner loop which is use for column 
           System.out.print(row+" ");  // print row number
                       }
       System.out.println();  // use  for next line 
    }
    }

    public static void main(String[] args) {
        int n=5; 
        nTriangle(n);
    }
}