import java.util.*;
//array traversing using for loop ,for each loop,while loop
 class tanmay{
void arraymethod(){
    //how to asign the array
int [] ages = new int[3];
 ages[0] = 20;// put the value in array using index
 ages [1]= 30;
 ages[2]= 40;

 //for loop
 for(int i =0;i<=2;i++){ //we can also use ages.length without i<=2
    System.out.println(ages[i]);
 } 

 //for each loop
 for(int i: ages){
    System.out.println(i);

 }

 //while loop
 int i = 0;
 while (i<=2) {
    System.out.println(ages[i]);
    ++i;
 }

   int [][] ages1 ={{1,2},{2,3},{4,5}};
   //for multidimension array
   for(int t =0;t<3;t++){
    for(int j =0;j<=t;j++){
        System.out.println(ages1[t][j]);
    }

   }


}

}
public class array3 {

    public static void main(String[] args) {
        tanmay obj = new tanmay();
        obj.arraymethod();
    }
}
