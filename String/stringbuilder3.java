/*
 * In this question the the string  is given with repeated character then we need to count this character 
   and write the the total count of character 
 */
import java.util.*;
public class stringbuilder3 {
    public static void main(String[] args) {
        
        String s = "aaabcccdee";
        String ans = "" + s.charAt(0);
        int count =1;
        for(int i =1;i<s.length();i++){
            char cuurent = s.charAt(i);
            char previous =s.charAt(i-1);
            if(cuurent==previous){
                count++;
            }
            else{
                ans += count;//add count in answer
                count =1;///again make the count 1 
                ans += cuurent;//again add next(current) value in answer for operation 
            }
        }
        ans += count;
        System.out.println(ans);
    }
}
