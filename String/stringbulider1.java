//toggle the character of a given string i.e convert the lowercase to uppercase
/*
 imp points
  Ascii values 
  A=65
  a=97
  0=48
 */

import java.util.*;
public class stringbulider1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i =0;i<str.length();i++){
            boolean flag = true; //true  ->capital
            char ch = str.charAt(i); //store the character evertime when the loop is executed
            int Ascii = (int)ch; // store the Ascii 
            if(ch==' ') continue;

            if(Ascii>97) flag =false; //small
            if(flag==true){
                Ascii += 32;
                char dh = (char)Ascii; //a
                str.setCharAt(i, dh);
            }
            else{ //small
                Ascii -= 32;
                char dh = (char)Ascii;
                str.setCharAt(i, dh);

            }



        }
        System.out.println(str);


        
    }
    
}
