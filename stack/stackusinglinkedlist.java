public class stackusinglinkedlist {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }
    public static class stackll{
        private Node head = null;
        private  int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.val + "");
                temp = temp.next;
            }
            System.out.println();
        }

        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        
        int size(){
            return size;
        }

        int peek(){
             if(head==null){
                System.out.println("stack is empty");
                return -1;
            
            }
            return head.val;

        }

        boolean isEmpty() {
          if(size==0) return true; 
           return false;
        }
    }
    
    public static void main(String[] args) {
      // stackusinglinkedlist stack = new stackusinglinkedlist();
        stackll st = new stackll();
        st.push(1);
        st.push(7);
        st.push(5);
        st.display();
        System.out.println(st.peek());
        

        st.display(); 
     //  System.out.println( st.peek());
         System.out.println();
        System.out.println(st.size());
        System.out.println();
        st.pop();
        st.display();
    

    }
}

