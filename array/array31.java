//addtion of two matrix
/*
 * note
 * when we add two matrix then there length of two matrix is same without same error there is  an error 
 */
import java.util.Scanner;

public class array31 {
    static void printarray(int[][] array){
        for(int i = 0; i < array.length; i++){//rows
            for(int j = 0; j < array[i].length; j++){//column
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void addtwomatrix(int[][] a, int r1,int c1,int[][] b,int r2,int c2 ){
        if(r1 != r2 || c1 != c2){
            System.out.println("wrong input - addition not possible");
            return;

        }
        // IMP points 
        int[][] sum = new int[r1][c1];
            for(int i = 0; i < r1; i++){//row
            for(int j = 0; j < c1; j++){//column
            sum[i][j] = a[i][j] + b[i][j];

              }

          }
          printarray(sum);

        }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first matrix");
        System.out.println("enter the row number");
        int r1 = sc.nextInt();
        System.out.println("enter the column number");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1]; 
        
        System.out.println("enter the elements in array"+r1*c1);
        for(int i = 0; i < r1; i++){//row
            for(int j = 0; j < c1; j++){//column

                a[i][j]=sc.nextInt();


            }
          }
        System.out.println("enter the second matrix");
        System.out.println("enter the row number");
        int r2 = sc.nextInt();
        System.out.println("enter the column number");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2]; 
        
        System.out.println("enter the elements in array"+ r2*c2);
         for(int i = 0; i < r1; i++){//row
            for(int j = 0; j < c1; j++){//column

                b[i][j]=sc.nextInt();


          }
        }
      
         printarray(a);
         printarray(b);

         addtwomatrix(a, r1, c1, b, r2, c2);
       //  printarray();

    }

  }

    

