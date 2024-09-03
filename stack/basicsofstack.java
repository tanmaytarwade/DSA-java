import java.util.Stack;
import java.util.Scanner;

public class basicsofstack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
       // System.out.println(st.size());//0
       // System.out.println(st); // it give empty stack 
       //System.out.println(st.isEmpty()); // true

        //push operation use to put element in stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        //print function of stack 
        System.out.println(st);//[1, 2, 3, 4, 5,6]

        // peek is use for get the top most element in stack
       System.out.println( st.peek()); // 6

       //pop is use for remove the element(top element)
       st.pop(); //[1, 2, 3, 4, 5]
       System.out.println(st); 

       //size operation is use for get the size of stack 
       //when we use size at the time when no element in stack then they give 0 size 
       System.out.println(st.size());//5

       //when you need to print first element in stack 
       while (st.size()>1) {
        st.pop();

       }
       System.out.println(st.peek());
       System.out.println(st);

       //isempty operation give the answer in boolean way when stack is empty is give true when stack is not empty it give false
       System.out.println(st.isEmpty());

       //how to take stack size and stack element through the user 
       Scanner sc = new Scanner(System.in);
       Stack<Integer> tt = new Stack<>();
       //how many numbers of element do you want to put in stack
       System.out.println("enter the number element you want to put");
       int n= sc.nextInt();
       //enter the element:
       System.out.println("enter the element:");
       for(int i =1;i<=n;i++){
        int x = sc.nextInt();
        tt.push(x);
       }
       System.out.println(tt);





    
    }
}

