//In this question the given array is unsorted and we need to find smallest and largest element in that array
import java.util.*;

public class array12 {

    static int[] sortArray(int[] array) {
        //this Arrays.sort method is used to sort the arrays and this method is found in java.util.arrays package
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
    //for finding largset and smallest element  
    static int[] smallestandlargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length-1]};//arr.length-1 retrun end value 
        return ans;

    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 3, 5, 8, 6, 7};
       int[] ans = sortArray(array1);
       System.out.println("smallest:"+ ans[0]);
       System.out.println("largest:"+ ans[ans.length-1]);

    }
}


