import java.util.*;
public class basics {

    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("tanmay");
        st.add("karan");
        st.add("tarwade");
        System.out.println(st);
        System.out.println(st.contains("tanmay"));
        System.out.println(st.size());
        st.remove("karan");
      //  System.out.println("mark");
        for(String s : st){
            System.out.println(s);
        }
        
    }
}