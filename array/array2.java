import java.util.*;
 class tanmay{
void arraymethod(){
    //how to asign the 2D array
 //   int [][] array2d = new int[3][2];

    int [][] ages ={{1,2},{2,3},{4,5}};

// call the value of  2D array using array index
 System.out.println(ages[0][1]); // 2
 System.out.println(ages[0][0]);//1
 System.out.println(ages[2][1]);//5
// System.out.println(ages[1][2]); // watch carefully
 

}

}
public class array2 {

    public static void main(String[] args) {
        tanmay obj = new tanmay();
        obj.arraymethod();
    }
}
