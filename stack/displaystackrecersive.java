import java.util.Stack;
public class displaystackrecersive  {
    public static void reverserecuresation( Stack<Integer> st){
      if(st.size()==0) return;
      int top = st.pop();
      System.out.print(top + " ");
      reverserecuresation(st);
      st.push(top);

    }
    //then print stack recersive 
    public static void displayrecursive(Stack<Integer> st){
      if(st.size()==0) return;  //base condition 
      int top = st.pop();
      displayrecursive(st);
       System.out.print(top + " ");
      st.push(top);

    }
   


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
       reverserecuresation(st);
       System.out.println();
       displayrecursive(st);


    }
}
