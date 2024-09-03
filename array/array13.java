//find the total number of pairs in array whose sum is equal to the given value x.
import java.util.*;
// answer has nested for loop logic 
public class array13 {
    static int sumarray(int[] array, int x) {
        int ans = 0;
        for(int i =0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] + array[j] == x){
                    ans++;

                }
                
            }
            
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 3, 5, 8, 6, 7};
        System.out.println(sumarray(array1,3));
        System.out.println(sumarray(array1,5));

    }
}
