package LinkedList;
//find nth node from end of linkedlist
public class problem2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        //first method
        public static Node nthNode(Node head,int n){
            int size =0;
            Node temp = head;
            while (temp!=null) {
                size++;
                temp = temp.next;
                
            } 
            int m = size - n +1;
            //nth node from start
            temp = head;
            for(int i =1;i<=m-1;i++){
                temp = temp.next;
            }
            return temp;
        }
        //second method
         public static Node nthNode2(Node head,int n){
            Node slow = head;
            Node fast = head;
            for(int i =1; i<=n;i++){
                fast = fast.next;
            }
            while (fast!=null) {
                slow = slow.next;
                fast = fast.next;
            
            }
            return slow;


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
           Node q = nthNode(x,2);
           System.out.print(q.data);
           Node k = nthNode2(x, 1);
           System.out.println(k.data);

    }
}
}
