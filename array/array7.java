 import java.util.*;
 import java.util.Arrays;

 class array7{
 static void callmethod(int[] array){
     for(int i =0;i<array.length;i++){
     System.out.print(array[i]  + " ");

    }
    System.out.println();
 }

  public static void main(String[] args) {
    int[] array = {1,2,34,45,56,67};
    callmethod(array);

    // copy array using clone method 

    int [] array_2 = array.clone(); // clone method can make new memeory address in heap memeory area
    callmethod(array_2);

    // copy array using copyof  
    int [] array_3 = Arrays.copyOf(array_2, array_2.length);
    callmethod(array_3);
    
   /*  int [] array_2 = array;
    callmethod(array_2);*/

    array_2[0]=0;
    array_2[1]=10;

    System.out.println("original array");
    callmethod(array); 
    /*  both arrays refer the same the address then when we change the variables of array2 then
      array has been change  or we only copy the reference we can not generate new array
      then its called shallow copy
    */

    System.out.println("copy array");
    callmethod(array_2);

   
    

    
  }
    
}

