//given an array "a" consisting of integers.return the first value that is repeating in this array.if no value is being ,return -1
import java.util.*;
// answer has nested for loop logic 
public class array17 {
    static int repeatedelem(int[] array) {
     //  int ans = 0;
        for(int i =0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]  == array[j] ){
                    return array[i];

                }
            
            }

        }

    return -1;

    }

    

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 3, 5, 8, 6, 7,1,7};
        int[] array2 = {1, 2, 4, 3, 5, 8, 6, 7};
        int[] array3 = {1,2 ,3, 4, 5, 5,6};
        System.out.println(repeatedelem(array1));
        System.out.println(repeatedelem(array2));
        System.out.println(repeatedelem(array3));
        //System.out.println(sumarray(array1,5));

    }
}
