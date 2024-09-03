//sort an array consisting of 0 and 1
//logic behind this answer is fist we traverse the array the we got zero value we count this value and again traverse and give the condition that if  i is less than zero the print zero and else 1 
import java.util.*;
public class array25 {

    static void sortzeroandone(int[] array){
        int n = array.length;
        int zero = 0;
        for(int i =0;i<n;i++){
            if(array[i]==0){
               zero++; 
            }
        }
        for(int i =0;i<n;i++){
         if(i<zero){
          array[i]=0;
        }
        else{
            array[i]=1; 
        }
            
           
    }

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


