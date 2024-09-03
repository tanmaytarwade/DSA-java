package LinkedList;

// Implementation of a singly linked list
public class implementation {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    } 

    public class LinkedList {
        Node head;
        Node tail;

        LinkedList() {
            this.head = null;
            this.tail = null;
        }
// insert at end elements 
//through this method we can make linkedlist
// Time complexity = 0(1) 
            void insertAtEnd(int value) {
            Node newNode = new Node(value);
            if (head == null) {//empty list
                head = newNode;
                tail = newNode;
            } else {//non empty list
                tail.next = newNode;
                tail = newNode;
            }
        }
        
//insert the elements at begining  
// Time complexity = 0(1) 
        void insertathead(int value){
            Node newNode = new Node(value);
            if(head == null){//empty list
                head = newNode;
                tail = newNode;
            }
            else{ //non empty list
                newNode.next = head;
                head = newNode;
            }
        } 
        
    // insert the elements at given index 
    //Time complexity=o(n),space complexity = o
    void insertatindex(int index,int value){
          Node t = new Node(value);
          Node temp =  head;
          //this condition is use when input index is equal to the size or at the end of index 
          if(index==size()){
            insertAtEnd(value);
            return;
          }
          //this condition is use when input index is 0 
           else if(index==0){
            insertathead(value);
            return;
          }
          //this condition is use when wrong input or index is given 
          else if(index<size() || index>size()){
            System.out.println("wrong input");
            return;
          }
          //condtion for inset the value at given index 
          //(this method explain in notebook)
          for(int i=1;i<=index-1;i++){//use for traverse the linked list from 1 to the index given by user to(index-1)position 
            temp = temp.next;//node temp traverse with for loop
          }
            t.next = temp.next;
            temp.next =t;

    }
    // method for get the element at given index 
    int getelement(int index){
        Node temp = head;
        for(int i=1;i<=index;i++){
            temp = temp.next;
        
        }
        return temp.data;
    }
// this method is use to deleted the elements at given index 
////(this method explain in notebook) 
      void deletedatindex(int index){
        Node temp = head;
        if(index==0){
            head = head.next;

        }
         for(int i =1;i<=index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail =temp;

      }
    // this method is use to show or display the linked list 
        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(); // Print a new line after displaying the list
        }
    // this method give size of linked list
    // Time complexity = 0(n) 
        int size(){
             Node current = head;
             int count = 0;
              while (current != null) {
                count++;
                current = current.next;
            }
            return count;

        }
    }

    public static void main(String[] args) {
        implementation linkedListImpl = new implementation();
        LinkedList linkedList = linkedListImpl.new LinkedList();

        linkedList.insertAtEnd(2);  
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(200);
        linkedList.insertAtEnd(2000);
        linkedList.insertathead(5);
        linkedList.insertathead(10);
        linkedList.insertatindex(2, 35);
        linkedList.insertatindex(7, 100);
        //without writing if condition for 0 index in insertataindex method 
        linkedList.insertatindex(0, 1);
        // with writing if condition for 0 index
        linkedList.insertatindex(0, 50);

        linkedList.display();
        System.out.println(linkedList.size());
        linkedList.display();
        //show the tail data
        System.out.println(linkedList.tail.data);
        //show the head data
        System.out.println(linkedList.head.data);
        System.out.println(linkedList.getelement(5));
        System.out.println(linkedList.getelement(0));

        linkedList.deletedatindex(3);
        linkedList.display();
        linkedList.deletedatindex(6);
        linkedList.display();
        //without using tail =temp;
        System.out.println(linkedList.tail.data);
        //with using tail = temp;
        System.out.println(linkedList.tail.data); 

    }
}

