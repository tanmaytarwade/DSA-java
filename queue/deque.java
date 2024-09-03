// deque 
import java.util.*;
public class deque {

    public static void main(String[] args) {
        //you can also use this using arrayDeque
        Deque<Integer> d = new LinkedList<>();
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.addLast(4);
        d.addFirst(10);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        d.add(8);//this is normal add value same as other add operation
       

    }
}
