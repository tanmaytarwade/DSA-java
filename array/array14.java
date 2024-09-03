//count the number of triplets whose sum is equal to the given target.
import java.util.*;
// answer has nested for loop logic 
//in this ans we first set i value after set the j value and rotated the kth loop and after one loop is complete
//then again set next j value and again rotated kth loop and so on
public class array14 {
    static int sumarray(int[] array, int x) {
        int ans = 0;
        for(int i =0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int k = j+1;k<array.length;k++){
                if(array[i] + array[j] + array[k] == x){
                    ans++;

                }
                
            }
        }
            
    }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] array1 =new int[n];
        System.out.println("enter the elements in array");
        for(int i =0;i<array1.length;i++){
            array1[i]=sc.nextInt();
        }
        int[] array2 = {1, 2, 4, 3, 5, 8, 6, 7};
        int[] array3 = {20, 40, 58, 20, 40, 58};

        System.out.println(sumarray(array1,100));
        System.out.println(sumarray(array2,100));
        System.out.println(sumarray(array3,100));


    }
}