//count the number of elements strictly greter then value x
import java.util.*;
public class array10 {

static  int  countoccurrence(int array1[],int x){
           int count =0;
           for(int i =0;i<array1.length;i++){
            if(array1[i] > x){
                count++;

            }
        }
         return count;   
  }
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,1,2,1,1};
        System.out.println(countoccurrence(array1, 2));
    }
    

    
}
