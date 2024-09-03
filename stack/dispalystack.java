import java.util.Stack;
public class dispalystack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();  
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        //display stack using same method
        // reverse order
      /*  Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
            
        }
        //System.out.println(rt);
        while (rt.size()>0) {
            int x = rt.pop();
            System.out.print(x+ " ");
            st.push(x);
        }
        System.out.println(st); */

        //display stack using array
        int n = st.size();
        int[] arr = new int[n];
        for(int i =n-1;i>=0;i--){
            arr[i] = st.pop();
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
            st.push(arr[i]);
        }


    }
}
