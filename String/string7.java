import java.util.*;
public class string7 {
   public static void main(String args[]){
    // this is answer of one question (question is form college walla string video)
    String s = "abcd";
    for(int i =0;i<=3;i++){
        for(int j= i+1;j<=4;j++){
            System.out.print(s.substring(i,j)+" ");
        }
    }
    String s1 = "tanmay";
    String s2 = "tanmay";

    s2 = "def";
    System.out.println(s2);//output is not tanmay output is def due to "interning".

   } 
}
//most imp points
/*
 *interning and new from college walla string video watch this 
 imp notes[strings are immuntable they do not change]
 */
