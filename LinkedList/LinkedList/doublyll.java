package LinkedList;

// Representation of doubly linked list
public class doublyll {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }
     // This function is used for displaying the linked list
    public static void display(Node head) { 
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //This function is used for displaying the linked list in reverse order
    public static void displayreverse(Node tail) { 
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val +" ");
            temp = temp.prev; // we move previous way
        }
        System.out.println();
    }
    //this function use when random node is given  
     public static void display2(Node random) { 
        Node temp = random;
        //for first element from random node is head or a
        while (temp.prev!=null) {
            temp = temp.prev;
        }
        //for last element from random node is tail or e
        while (temp != null) {
            System.out.print(temp.val +" ");
            temp = temp.next; // we move previous way
        }
        System.out.println();
    }

    //this function is use for inseration of new element at head in DLL
    public static Node insertathead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return t;
    }
    //this function is use for inseration of new element at tail in DLL
       public static void insertattail(Node head,int x){
        Node temp = head;
        //first move temp to tail
        while (temp.next!=null) {
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    
    }
    //this function is use for inseration of value at given index
     public static void insertatindex(Node head,int index,int x){
        Node s = head;
        for(int i =1;i<=index-1;i++){
            s =s.next;
        }
        //s is at index-1 poistion
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev =s;
        t.next =r;
        r.prev = t;
    
    }    
    
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(10);
        Node e = new Node(12);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        displayreverse(e);
        display2(c);
       Node newhead = insertathead(a, 30);
        display(newhead);

        display(a);
        insertattail(a, 20);
        display(a);

        insertatindex(a, 2, 60);
        display(a);
    }
}
