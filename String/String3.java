import java.util.*;
public class String3 {
    public static void main(String args[]){
// String indexOf() The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
String s ="tanmay tarwade is here";
int n = s.indexOf('i');
System.out.println(n);
//System.out.print(s.indexOf('i'));

/*compare to()
The Java String class compareTo() method compares the given string with the current string lexicographically. It returns a positive number, negative number, or 0.
It compares strings on the basis of the Unicode value of each character in the strings.
if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0  */
String s1 = "tanmany";
String s2 = "tarwade";
System.out.println(s1.compareTo(s2));
 
String s3 = "abc";
String s4 = "gtr";
System.out.println(s3.compareTo(s4));

String s5 = "gtr";
String s6 = "abc";
System.out.println(s5.compareTo(s6));



}
}
