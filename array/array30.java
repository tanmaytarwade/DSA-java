//how to take input in 2D array

import java.util.Scanner;

public class array30 {
    static void printarray(int[][] array){
        for(int i = 0; i < array.length; i++){//rows
            for(int j = 0; j < array[i].length; j++){//column
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
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
}
}
