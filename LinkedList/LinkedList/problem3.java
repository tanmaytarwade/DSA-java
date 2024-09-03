package LinkedList;
//remove nth node from last in linked list 
public class problem3 {
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        public static Node nthremovNode(Node head,int n){
            Node slow = head;
            Node fast = head;
            for(int i =1;i<=n;i++){
                 fast = fast.next;
            }
            if (fast==null){ // when they give first node from start 
            head = head.next;
            return head;
                
            }
            while (fast.next!=null) {//tail
                //because we need previous node for make the connection 
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return head;

        }
        public static void display(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(); // Print a new line after displaying the list
        }
    
        public static void main(String[] args) {
        Node x = new Node(3);
        Node t = new Node(2);
        Node a = new Node(1);
        Node n = new Node(10);
        Node m = new Node(12);  
        x.next = t; 
        t.next = a;
        a.next = n;
        n.next = m;
        // System.out.println(nthremovNode(x, 2));
       // display(x);
      //  nthremovNode(x, 2);
     //  display(x);
       // nthremovNode(x, 5);//it give error because your while condition goes to the null
       //for this error we can use if condition 
       display(x);
       x = nthremovNode(x, 5);
       display(x);
       x = nthremovNode(x, 1);
       display(x);

  }
}
}

