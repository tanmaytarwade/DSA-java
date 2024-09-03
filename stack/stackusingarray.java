// implementation of stack using array 
import java.util.*;
import java.util.Stack;
public class stackusingarray {
    private int[] arr = new int[5];
    // index always be one step froward to the push element means you put three element in stack then your array index in 4thindex
     private int index = 0;
    void push(int x){
        if(index==arr.length) {System.out.println("Stack is Full");return;}
        arr[index] = x;
        index++;

    }
    int peek(){
        if(index==0){
            System.out.println("stack is empty");
        }
            return index-1;
    }


    int pop(){
         if(index==0){
            System.out.println("stack is empty");
        }
        int top = arr[index-1];
        arr[index-1] = 0;
        index--;
        return top;
    }

    void display(){
        for(int i =0;i<=index-1;i++){
            System.out.println(arr[i]);
        }
    }

    int size(){
        return index;
    }

    public static void main(String[] args) {
        //object oop
        stackusingarray  st = new stackusingarray();
        st.push(1);
        st.push(7);
        st.push(5);
        //st.display();
        System.out.println(st.peek());
        

        st.display(); 
     //  System.out.println( st.peek());
         System.out.println();
        System.out.println(st.size());
        System.out.println();
        st.pop();
        st.display();

    }
}
