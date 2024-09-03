import java.util.*;
import java.util.Stack;
public class prefixevaluation {
   
    public static void main(String[] args) {
        String infix = "-9/*+5346";

        Stack <Integer> val = new Stack();
        for(int i =infix.length()-1;i>=0;i--){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57 ){
             val.push(ascii-48);
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                 if(ch=='-') val.push(v1-v2);
                 if(ch=='+') val.push(v1+v2);
                 if(ch=='*') val.push(v1*v2);
                 if(ch=='/') val.push(v1/v2);
                 
            }
    }
    System.out.println(val.peek());
}
}
