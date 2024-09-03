import java.util.*;
public class insertinstack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        // you put element  5 in bottom in st stack
        int index = 2;
        int x =1;
        Stack<Integer> rt = new Stack<>();
        while (st.size()>index) {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size()>0) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
