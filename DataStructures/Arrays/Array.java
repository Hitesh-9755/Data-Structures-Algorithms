
class Array {
    public static void main(String[] args) {
        int arr[][]={ {1,2,3} ,{4,5,6}};  // 2D Array 
        System.out.println(arr[1][2]);
        int[] arr1= new int[5]; 
        for (int i=0;i<5;i++ ){
            arr1[i]=i;
            System.out.print(arr1[i]);
        }
      System.out.println();
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
