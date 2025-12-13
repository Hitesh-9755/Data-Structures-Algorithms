class Solution {

    int countDigit(int n) {
    int temp=n;
    int count=0;
    while(temp>0){
        temp=temp/10;
      count++;
    }
    return count;
    }

    // void ModulasLogic(int n){
    //     double temp1=n;
    //     while(temp1>0){  
    //         System.out.println(temp1%=10);
    //     }
    // }
};

public class CountDigit{
public static void main(String[]args){
Solution s1 = new Solution();
// System.out.println("Count is "+s1.countDigit(16456424));
s1.ModulasLogic(133);
}

}