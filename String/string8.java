 //most imp points
/*
 *interning and new from college walla string video watch this 
 imp notes[strings are immuntable they do not changed 
 also watch immuntable section
 */
import java.util.*;
public class string8 {
    public static void main(String args[]){
        String s1 = "tanmay";
        String s2 = "tanmay";
    
        s2 = "def";
        System.out.println(s2);//output is not tanmay output is def due to "interning".

    }
}
