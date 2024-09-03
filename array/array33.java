//transpose of matrix
/**
 * for this method first we create ans array in this  we store our answer for this we traverse the array 
 * using for loop i traverse in column  and  j traverse in row after this we stored this answer in opposite form.
 * means array[i][j]= ans[j][i](only for understanding )
 */
import java.util.Scanner;

public class array33 {
    static void printarray(int[][] array){
        for(int i = 0; i < array.length; i++){//rows
            for(int j = 0; j < array[i].length; j++){//column
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transposearray(int[][] a,int r , int c){
        int[][] ans = new int[c][r];
        for(int i =0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = a[j][i];
            }

        }
        return ans;

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
      int[][] transposedArray = transposearray(array, r, c); // Capture the transposed matrix
      printarray(transposedArray); // Print the transposed matrix
  
}
}

