//given an integer array 'a'sorted in non-decreasing order retrun an array of square of each of each number sorted in non-decerasing order

// answer is too much simple watch dry run of code
import java.util.*;
public class array28 {
    static void swapInarray(int array[],int i,int j){
        //here we use swap method logic same as array19 
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    static void reverse(int[] arr){
        int i =0;
       int  j=arr.length-1;
       while (i<j) {
        swapInarray(arr, i, j);
        i++;
        j--;
        
       }

    }

    static int[] swaparrayofsquare(int[] array){
        int n = array.length;
        int left =0;
        int right = n-1;
        int[] ans = new int[n];
        int k = 0; 
        while (left<=right) { // becaues when we travers the array left and right is swap(or at equal) then we also need to store the last value.
            if(Math.abs(array[left])>Math.abs(array[right])){
                ans[k++] = array[left]*array[left];
                left++;
            }
            else{
                ans[k++] = array[right]*array[right];
                right--;
            }
        }

    return ans;

}
    static void printarray(int arr[]){
         for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]  + " ");

         }
         System.out.println();
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of array");
    int n =sc.nextInt();
    int[] array1 = new int[n];
    System.out.println("enter the element of array");
    for(int i =0;i<n;i++){
        array1[i]=sc.nextInt();
    }
    System.out.println("original array");
    printarray(array1);
    System.out.println("sorted array");
    int[] ans =swaparrayofsquare(array1);
    reverse(array1);
    printarray(ans);

        

 }
}
