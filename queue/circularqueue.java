//implementaion of circular queue using array
import java.util.*;
public class circularqueue {

    public static class circular{
        int front =-1;
        int rear = -1;
        int size =0;
        int[] arr = new int[5];
        public void add(int val)throws Exception{
            if(size == arr.length){
                throw new Exception("queue is full");
            }
            else if(size ==0){
                front =rear=0;
                arr[0] = val;
            }
            else if(rear < arr.length-1){//normal case 
                arr[++rear] = val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size ==0){
                throw new Exception("queue is full");

            }
            else{
                int val =arr[front];
                if (front == arr.length-1)  front =0;
                else front++;
                size--;
                return val;               
            }
            
        }
        public int peek() throws Exception{
              if(size ==0){
                throw new Exception("queue is full");

            }
            else return arr[front];
        }
        public boolean isempty(){
            if(size ==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                
            }
            else if(front<=rear){//normal condition
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }

            
            else{ //rear < front
                for(int i =front;i<arr.length;i++){
                    System.out.println(arr[i] + " ");
                }
                for(int i =0;i<=rear;i++){
                    System.out.println(arr[i] + " ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        circular c = new circular();
        c.display();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.display();
        System.out.println(c.peek());
        c.remove();
        c.display();
        System.out.println(c.isempty());
        c.add(6);
        c.display();
        c.remove();
        c.add(7);
        c.display();


        
    }
}
