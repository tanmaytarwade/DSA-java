//two pointer questions
//sort an array consisting of 0 and 1
/*
  answer is to much simple take to pointer left and right 
   left start from 0 and right start from n-1(backside of array) 
   then if left contain 1 and right contain 0 the swap the both the value using swap method
   and if left contain 0 then increment the value 
   and if rigth contain 1 then decrement the value
 */

import java.util.*;
public class array26 {

    static void sortzeroandone(int[] array){
        int n = array.length;
        int left =0;
        int right = n-1;
        while (left< right) {
            if(array[left]==1 && array[right]==0){
                swapInarray(array,left,right);
                left++;
                right--;

            }
            if(array[left]==0){
                left++;
            }
            if(array[right]==1){
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
    sortzeroandone(array1);
    printarray(array1);

        

 }
}



