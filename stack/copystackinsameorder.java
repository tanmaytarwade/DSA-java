import java.util.Stack;
public class copystackinsameorder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);

        // reverse order
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
            
        }
        //System.out.println(rt);
        while (rt.size()>0) {
            st.push(rt.pop());
        }
        System.out.println(st); 
    }
}
