import java.util.*;
public class string9 {

    public static void main(String[] args) {
        //difference between isEqual() and ==
    String s = "tanmay";
    String s1 = "tanmay";
    String x = new String("tanmay");
    System.out.println(s==s1);
    System.err.println(s==x); // == only check the address of string
    System.out.println(s.equals(x));//equals can chack the every character not address

   
    }
}