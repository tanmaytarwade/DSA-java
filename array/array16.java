// find the second highest number in array
/*for this answer pf second maximum method goes through the video and watch dry run */
import java.util.*;

public class array16 {
    //this method find maximum number 
    static int maxnumber(int[] array) {
        //this Integer.MIN_VALUE give the minimum value of integer
        int max_number = Integer.MIN_VALUE;
        //becaue we every value is grater then infinity value and we also compare the max_number with array[i] through this we take this things
        for(int i =0;i<array.length;i++){
           if(array[i] > max_number ){
            max_number = array[i];
           }
            
        }
        return max_number;

    }
    //this method find minimum number
     static int minnumber(int[] array) {
        //this Integer.MAX_VALUE give the maximum value of integer
        
        int min_number = Integer.MAX_VALUE;
        //becaue we every value is smaller then maximum integer value and we also compare the min_number with array[i] through this we take this things
        for(int i =0;i<array.length;i++){
           if(array[i] < min_number ){
            min_number = array[i];
           }
            
        }
        return min_number;

    }
    //this method find secondmaximum number 
    static int secondmaximum(int array[]){
        int mx = maxnumber(array);
        for(int i =0;i<array.length;i++){
        if(array[i] == mx){
            //this is also call array mainpulation(change the elements in arrays)
            array[i] = Integer.MIN_VALUE;// through this highest number become the "-∞" 

        }    
    }
     int secondmaximum = maxnumber(array);
    return secondmaximum;
}


    public static void main(String[] args) {

    // this Integer.MAX_VALUE give the maximum value of integer
        System.out.println(Integer.MAX_VALUE);
    //  this Integer.MIN_VALUE give the minimum value of integer
        System.out.println(Integer.MIN_VALUE);
        int[] array1 = {1, 2, 4, 3, 5, 8, 6, 7};
        System.out.println(maxnumber(array1));
        System.out.println(minnumber(array1));
         System.out.println(secondmaximum(array1));
        

    }
}
