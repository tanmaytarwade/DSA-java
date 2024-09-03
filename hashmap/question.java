// maximum value in array (question from notebook)

import java.util.HashMap;
import java.util.Map;

public class question {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,1,2,2};
        //first make hashmap
          Map<Integer, Integer> freq = new HashMap<>();

          //we trverse the array using for loop
          for(int el : arr){
            //if the map do not contain the key then put the key in map with 1 occurce
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            // when the more value(occurence increse) the add them
            else{
                freq.put(el,freq.get(el) + 1);
            }

          }
          System.out.println("frequence map");
          System.out.println(freq.entrySet());
          //for finding max value we need two thing 
          int maxfreq = 0, anskey = -1;
          for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxfreq) {
                maxfreq = entry.getValue();
                anskey = entry.getKey();
            }
          }
          System.out.println("Key with the highest frequency: " + anskey);
          System.out.println("Frequency of the key with the highest frequency: " + maxfreq);



    }
}
