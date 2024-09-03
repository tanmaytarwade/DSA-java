import java.util.*;
class tanmay{

void arraymethod(){
    //sum of array
   int [] ages = {1,2,3,4,5,6,7,8,9,10};
   int sum = 0;
   for(int i =0;i<ages.length;i++){
     sum = sum + ages[i];
  }
  System.out.println(sum);


 
 
 }

}
public class array4 {

    public static void main(String[] args) {
        tanmay obj = new tanmay();
        obj.arraymethod();
    }
}
