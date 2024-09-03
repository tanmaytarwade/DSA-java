import java.util.*;
//this code for infix operation for brackets ().
public class prefixoperation {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        Stack <String> val = new Stack();
        Stack <Character> op = new Stack();
        for(int i =0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            //'0' -> 48 and '9' -> 57
            //first here we convert str into int
            if(ascii>=48 && ascii <=57 ){
                String s = "" + ch;
                val.push(s);
            }
            //same code as previous only change is here 
            else if(op.size()==0 ||ch == '(' || op.peek()=='(')
            op.push(ch);
            else if(ch==')') {
                while (op.peek()!='(') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); //'(' hata diya

            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                     //push
                     op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                     //push
                     op.push(ch);
                    }
                    else op.push(ch);
                }


            }

            
        }
        //val stack is -> 1
        while (val.size()>1) {
            //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);

        }
        String prefix = val.pop();
        System.out.println(prefix);
    }

}



