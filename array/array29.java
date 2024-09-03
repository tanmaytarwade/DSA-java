//2D array representation 
//how to repesented 2D array
//int[][] array = new int[row][columns];
//                       [mandatory][optional]                          
public class array29 {
    static void printarray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //method1
        int[][] array = new int[3][3];
        array[0][0]=1;
        array[0][1]=2;
        array[0][2]=3;
        array[1][0]=4;
        array[1][1]=5;
        array[1][2]=6;
        array[2][0]=4;
        array[2][1]=5;
        array[2][2]=6;

        //method2
        int[][]array1={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


    
        printarray(array);
        printarray(array1);

    }


}
