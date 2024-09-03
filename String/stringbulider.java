/* given string s return the number of palindromic substrings in it 
 plandromic means when you revers any string and the string is in same format
 then it is plandromic string 
 for e.g aba = aba 
*/

import java.util.*;
public class stringbulider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word for check the palindrom");
         String s =sc.next();
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        String s1 = str + "";
        if(s.equals(s1)){
            System.out.println("this string is palindrom");
        }
        else{
            System.out.println("this is not palindrom");
        }
        
    }
}
