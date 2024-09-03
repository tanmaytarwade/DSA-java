//roated matrix in 90 degrees in clockwise direction
/*
 * when we roated array in 90 degree then we can follow this step:
 * 1.in first step we transpose the array 
 * 2. the we reverse the transpose array 
 */
import java.util.Scanner;

public class array35 {
    static void printarray(int[][] array){
        for(int i = 0; i < array.length; i++){//rows
            for(int j = 0; j < array[i].length; j++){//column
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeinplace(int[][] a,int r , int c){
        for(int i =0;i<c;i++){
            for(int j=i;j<r;j++){ // why we start this j from i go through the video(when we can not start from j then they can swap the ans two time then we get same array again)
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

                
            }
        }
    }
    static void reversearray(int[] array){
        int i =0; int j= array.length-1;

        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }
    static void rotated(int[][]array,int n){
        transposeinplace(array, n, n);
        for(int i =0;i<n;i++){
            reversearray(array[i]);
        }
    }
        
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row number");
        int r = sc.nextInt();
        System.out.println("enter the column number");
        int c = sc.nextInt();
        int[][] array = new int[r][c]; 
        
        System.out.println("enter the elements in array"+r*c);
        for(int i = 0; i < r; i++){//row
            for(int j = 0; j < c; j++){//column

                array[i][j]=sc.nextInt();


        }
      }
      printarray(array);
      System.out.println("output of method");
      transposeinplace(array, r, c); // Capture the transposed matrix
      printarray(array);
      rotated(array, r);
      printarray(array);
    
  
}
}

