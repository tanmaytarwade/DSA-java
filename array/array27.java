/*given an array of integer a moves all the even integers at beginning of array followd by all the odd integers the relative order of odd or even
odd or even integers odd does not matter retrun any array that satisfies the condition*/

// logic of answer is same as pervious question
import java.util.*;
public class array27 {

    static void sortarrayoddandeven(int[] array){
        int n = array.length;
        int left =0;
        int right = n-1;
        while (left<=right) { // becaues when we travers the array left and right is swap(or at equal) then we also need to store the last value.
            if(array[left]%2==1 && array[right]%2==0){
                swapInarray(array,left,right);
                left++;
                right--;

            }
            if(array[left]%2==0){
                left++;
            }
            if (array[right]%2==1) {
                right--;
            }
        }
    

}
static void swapInarray(int array[],int i,int j){
    //here we use swap method logic same as array19 
    int temp = array[i];
    array[i]=array[j];
    array[j]=temp;
}
    static void printarray(int arr[]){
         for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]  + "");

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
    sortarrayoddandeven(array1);
    printarray(array1);

        

 }
}



