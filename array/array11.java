//check the given array is sorted or not
import java.util.*;
public class array11 {
//  my logic 
/*static  boolean  countoccurrence(int array1[]){
           for(int i =1;i<array1.length;i++){
            if(array1[i]> array1[i-1]){
                return true;
            }
  
        }
        return false;  
  }*/
  
  static  boolean  countoccurrence(int array1[]){
    boolean check = true;

           for(int i =1;i<array1.length;i++){
            if (array1[i]< array1[i-1]) {
                check = false;
                break;
            }
           }
        return check;
    }

    public static void main(String[] args) {
        int [] array1 = {10,2,3,4,5,6,7,8};
        int [] array2 = {1,2,3,4,5,6,7,8};
        System.out.println(countoccurrence(array1));
        System.out.println(countoccurrence(array2));
    }
    

    
}
