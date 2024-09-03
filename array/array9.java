//find the last occurence of an elements in given array(imp question)
import java.util.*;
public class array9 {

static  int  checkmethod(int array1[],int x){
           int lastindex =-1;
           for(int i =0;i<array1.length;i++){
            if(array1[i] == x){
               lastindex =i; //imp
            }
        }
        return lastindex;
   
  }


    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,1,2,1,1};
        System.out.println(checkmethod(array1, 2));
    }
    

    
}
