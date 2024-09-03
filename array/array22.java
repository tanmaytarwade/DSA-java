//reverse the array  consisting of integer value using same array without using ans[] array
public class array22 {
    static void swapInarray(int array[],int i,int j){
        //here we use swap method logic same as array19 
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
     
    static void reverse(int[] array){
      int i =0;
      int j= array.length-1;
      while (i<j) {
        swapInarray(array, i, j);
        i++; //this increment the value of i 
        j--; // this decrement the value of j
      }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; 
        reverse(array1);
        for (int i = 0; i < array1.length; i++) { // Fix loop condition
            System.out.println(array1[i]); // Print each element of the reversed array
        } 
    }
}