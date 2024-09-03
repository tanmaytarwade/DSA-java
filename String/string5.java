import java.util.*;
public class string5 {
   public static void main(String args[]){
    //string+int/char/int
    String s= "abc";
    String s1 = s + "def";
    System.out.println(s1);
    s += "ef";
    System.out.println(s);
    s += "10";
    System.out.println(s);

    //imp point
    System.out.println("abc"+10+20);
    
    System.out.println(10+20+"abc");
    
} 
}
