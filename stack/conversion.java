//import java.util.*;
//conversion from prefix to postfix expression
import java.util.Stack;
public class conversion {
    //do not uderstand the error 
    public static void main(String[] args) {
        String infix = "-9/*+5346";
      //  int n = infix.length();

        Stack <String> val = new Stack();
        for(int i =infix.length()-1;i>=0;i--){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <=57 ){
             val.push(ch + "");
            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
            
               String t = v1 + v2 + op;
               val.push(t);
            }
        }
    System.out.println(val.peek());
}
}
