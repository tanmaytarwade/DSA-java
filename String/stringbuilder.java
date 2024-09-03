//stringbuilder can overcome the disadvantage of string
//Java StringBuilder class is used to create mutable (modifiable) String.
/*
 * Important Constructors of StringBuilder class
 * Constructor	             Description
StringBuilder()	             It creates an empty String Builder with the initial capacity of 16.
StringBuilder(String str)	 It creates a String Builder with the specified string.
StringBuilder(int length)	 It creates an empty String Builder with the specified capacity as length.
 */
import java.util.*;
public class stringbuilder {

    public stringbuilder(String string) {
    }

    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder();
        //append method()
        /*It is used to append the specified string with this string. The append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc. */
        str.append("tanmay");
        System.out.println(str);

        StringBuilder s = new StringBuilder("tanmay1");
        System.out.println(s);

        StringBuilder s2 = new StringBuilder(4);
        s2.append("Ram");
        System.out.println(s2);

        //setCharAt method 
        /*setcharat is method is use to set the new character at given postion and change in string due to stringbuilder 
          becauese the stringbuilder is mutable 
          */
          s.setCharAt(1,'n');
          System.out.println(s);

          //append use
          StringBuilder str1 = new StringBuilder("tanmay");
          str1.append("tarwade");
          System.out.println(str1);
        
          //insert method()
          /*
           It is used to insert the specified string with this string at the specified position. 
           The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.    
           deletecharat method()
           this method use to delete the the given index character
           */
          str1.insert(1,'y');
          System.out.println(str1);

          str1.deleteCharAt(1);
          System.out.println(str1);

          //reverse() method
          //It is used to reverse the string.
          str1.reverse();
          System.out.println(str1);

          //delete() method
          //It is used to delete the string from specified startIndex and endIndex.
          str1.delete(0, 1);
          System.out.println(str1);

          //some of the function of string are also  use in stringbuilder but some of are not use.
          


        
    }
}