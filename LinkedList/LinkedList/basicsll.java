package LinkedList;

public class basicsll{

    public static void display(Node head) {  //this is function is use for dispaly the LL
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp= temp.next;
        } 
   
    }
    // method to display linkedlist reverse
    public static void displayr(Node head) {
      if (head == null) return;
        displayr(head.next);
        System.out.print(head.data + " ");
      
    }
    // method to find length of linked list 
    public static int lengthofll(Node head) {
      int count = 0;
      while (head!=null) {
        count++;
        head= head.next;
    }
    return count;
    }
    //make node class to store the data and next node address
    public static class  Node{
        int data;//value
        Node next;// address of next node 
        Node(int data)  { //construter
            this.data = data;

        }      
    }
     public static void main(String[] args) {
        Node x = new Node(3);
        Node t = new Node(2);
        Node a = new Node(1);
        Node n = new Node(10);
        Node m = new Node(12); 
        //3->2->1->10->12

       x.next = t;
        //System.out.println(x.next); //LinkedList.basicsll$Node@15db9742
      // System.out.println(x.data);// 3
       //System.out.println(x.next.data); 2
       t.next = a;
       a.next = n;
       n.next = m;
      // System.out.println(x.next.next.data);//1

      Node temp = x; //now temp indicating x 
      // printing all elements of linkedlist using for loop
    /*   for(int i =0; i<=5;i++){
        System.out.println(temp.data +" " );
        temp=temp.next;
      }*/
    // code for display the linkedlist when we do not no the exact size of linkedlist 
      while (temp!=null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
      // we call head because  we need to preseve the head when we direct call to 'x' the we again call the LL then it show null
      //method to display linkedlist recursively 
      display(x);
      System.out.println();
      displayr(x);
      System.out.println();
      System.out.println(lengthofll(x));
      
    
    }
}