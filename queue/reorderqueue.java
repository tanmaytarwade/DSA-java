//question from notebook

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderqueue {

    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        //first step
        for(int i =1;i<=(n/2);i++){
            st.push(q.remove());

        }
        //step -2
        while(st.size()>0){
            q.add(st.pop());

        }
        //step -3
         for(int i =1;i<=(n/2);i++){
            st.push(q.remove());

        }
        //step -4 one by one
         while (st.size()>0) {        
            q.add(st.pop());
            q.add(q.remove());

        }
        //step -5
        //reverse the queue using stack
        while (q.size()>0) {
            st.push(q.remove());
        }
        while (st.size()>0) {
            q.add(st.pop());
        }
        System.out.println(q);



        
    }
}
