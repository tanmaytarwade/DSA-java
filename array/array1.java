import java.util.*;
 class tanmay{
void arraymethod(){
    //how to asign the array
int [] ages = new int[3];
 ages[0] = 20;// put the value in array using index
 ages [1]= 30;
 ages[2]= 40;

 System.out.println(ages[0]); // call the value of array using array index 
 System.out.println(ages[1]);
 System.out.println(ages[2]);

 //find the length of array
 System.out.println(ages.length);

}

}
public class array1 {

    public static int length;

    public static void main(String[] args) {
        tanmay obj = new tanmay();
        obj.arraymethod();
    }
}