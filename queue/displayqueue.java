import java.util.*;
public class displayqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new ArrayDeque<>();
        while (q.size()>0) {
            System.out.println(q.peek());
            helper.add(q.poll());
        }
        while (helper.size()>0) {
            q.add(helper.poll());
        }
            
        };
    }

