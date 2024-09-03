//hashmap implementation 
//hashmap implementation can be using array of linkedlist
import java.util.*;
public class implementation {
    static class HashMap<k,v> {
        //linkedlist 
    private class Node{
        k key;
        v value;

        public Node(K key, v value){
            this.key=key;
            this.value= value;

        }
    }

    private int n; //n-node
    private int N;//N - size(buckets)
    //here bucket is array and linkedlist is there type
    private LinkedList<Node> buckets[]; //N=bucket.length

    @SuppressWarnings("unchecked");
    public HashMap(){ //constructer
        this.N =4;
        this.buckets = new LinkedList[4];
        //for creating linkedlist on every index of array
        for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();            
        }
    }
    //this function take key value and give bucket index(linkedlist index)
    private int hashfunction(k key){
        int bucketindex = key.hashCode();
        return Math.abs(bucketindex);

    }
    //this function is use for finding linkedlist index 
    private int searchInLL(k key,int bucketindex){
        LinkedList<Node> ll = buckets[bucketindex];
        for (int i = 0; i < ll.size(); i++) {
            if(ll.get(i).key == key){
                return i;
            }

        }
        return -1;

    }
    private void rehash(){
        LinkedList<Node> oldbucket[] = buckets;
        buckets = new LinkedList[N*2];
        //for creating empty linkedlist
        for(int i =0;i<N*2;i++){
            buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < oldbucket.length; i++) {
            LinkedList<Node> ll = oldbucket[i];
            for(int j =0;j<ll.size();j++){
                Node node = ll.get(j);
                put(node.key, node.value);
            }
            
        }
    }
    public void put(k key,v value){
        int bucketindex = hashfunction(key);
        int dataindex =searchInLL(key, bucketindex);

        if (dataindex==-1) {//key doesn't exists
            buckets[bucketindex].add(new Node(key,value));
            n++; 
        }
        else{ //key exists
            Node node = buckets[bucketindex].get(dataindex);
            node.value = value; //update that value

        }
        double lambda = (double)n/N;
        if (lambda > 2.0) {
            //rehashing
            rehash();
            
        }

    }
    public v get(k key){
         int bucketindex = hashfunction(key);
         int dataindex =searchInLL(key, bucketindex);

        if (dataindex==-1) {//key doesn't exists
            return null;
        }
        else{ //key exists
            Node node = buckets[bucketindex].get(dataindex);
            return node.value;

        }
    }

    public boolean containsKey(k key){
          int bucketindex = hashfunction(key);
         int dataindex =searchInLL(key, bucketindex);

        if (dataindex==-1) {//key doesn't exists
            return false;
        }
        else{ //key exists
            return true;

        }
    }

    public V remove(k key){
        int bucketindex = hashfunction(key);
         int dataindex =searchInLL(key, bucketindex);

        if (dataindex==-1) {//key doesn't exists
            return null;
        }
        else{ //key exists
             Node node = buckets[bucketindex].remove(dataindex);
            return node.value;

        }

        public ArrayList<K> keyset(){
            ArrayList<K> key = new ArrayList<>();

            for(int i =0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    key.add(node.key);
                    
                }
            
            }
        return keys;
            
        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("india", 190);
        map.put("chaina",200);
        map.put("us",150);

    }




        
    }

    
}
