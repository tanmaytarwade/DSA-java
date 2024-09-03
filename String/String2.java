import java.util.*;
public class String2 {
    //next is only use store single word after the space any word is present they can not store
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the name");
    String myobj = sc.next();
    System.out.println(myobj);

    //nextline is use to store the whole the line with the space
    Scanner sc1 = new Scanner(System.in);
    System.out.println("enter the full name");
    String myobj1 = sc1.nextLine();
    System.out.println(myobj1);

    //length is use find the length of string
    System.out.println(myobj.length());
    System.out.println(myobj1.length());

    //charAt is use to give the character at the give number
    System.out.println(myobj.charAt(3));
    System.out.println(myobj1.charAt(7));

    

}
}
