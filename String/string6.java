import java.util.*;
public class string6 {
  public static void main(String args[]){
    // substring
    /*
     for e.g 
     String str = "abcd"
     substrings are a,ab,ac,ad,b,bc,bd,c,cd,d
     */
    String s = "tanmay";
    //In substring function substring beginindex is include and endindex is execluded(means index of for value is not printed)
    System.out.println(s.substring(0, 4));

    System.out.println(s.substring(0, 0)); //output is empty

    System.out.println(s.substring(0));//after 0 index all the value is printed

  }  
}
