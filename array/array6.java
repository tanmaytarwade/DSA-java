/**
 * program for taking input of array
 */
import java.util.*;
public class array6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        //how to take elements of array

        System.out.println("enter the elements of array");

        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        //for printing the elements 
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
