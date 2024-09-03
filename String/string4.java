import java.util.*;
public class string4 {
   public static void main(String args[]){
    /*contain()
    The Java String class contains() method searches the sequence of characters in this string. 
    It returns true if the sequence of char values is found in this string otherwise returns false.
    remember only string not chararcter.

 */
String s="tanmay tarwade";
System.out.println(s.contains("may"));
System.out.println(s.contains("wad"));

/*startwith()
 The syntax or signature of startWith() method is given below.
 1.public boolean startsWith(String prefix)  
 2.public boolean startsWith(String prefix, int offset)  

*/
System.out.println(s.startsWith("tan"));
System.out.println(s.startsWith("a", 1));
System.out.println(s.startsWith("a", 2));

/*
String toUpperCase() and toLowercase()
 The java string toUpperCase() method returns the string in uppercase letter. 
 In other words, it converts all characters of the string into upper case letter.
 */
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());

/* 
 String concat
The Java String class concat() method combines specified string at the end of this string. 
It returns a combined string. It is like appending another string.
*/
String s2 = "nothing is more hard ";
String c = s.concat(s2);
System.out.println(s.concat(s2));
System.out.println(c);

   } 
}
