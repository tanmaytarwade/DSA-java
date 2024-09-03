import java.util.*;
import java.util.Map.Entry;
public class basic {
    static void hashmapmethod(){
        //syntax
        Map<String, Integer> mp = new HashMap<>();
        //adding element
        mp.put("Aakash", 21);
        mp.put("Yash", 16);
        mp.put("Lva", 19);
        mp.put("rishab", 20);
        mp.put("tanmay",21);
        //geting value of key from the hashmap
        System.out.println(mp.get("tanmay"));//21
        System.out.println(mp.get("aryan")); // null becaues the value is not present 

        //changing or updating value of key from the hashmap
        mp.put("tanmay",20);
        System.out.println(mp.get("tanmay")); //20

        //remove pair from hashmap
        System.out.println(mp.remove("Aakash"));//21
        System.out.println(mp.remove("riya")); //null

        //checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Aakash"));//false
        System.out.println(mp.containsKey("tanmay"));//true

        //adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("vedanti", 16); //will entered because it is new 
        mp.putIfAbsent("tanmay", 20); // not entered beacaue it is present

        //get all the keys in hashmap
        System.out.println(mp.keySet());

        //get all the values in hashmap
        System.out.println(mp.values());

        //get all the entries in hashmap
        System.out.println(mp.entrySet());

        // traversing all the entries of hashamap - multiple methods
        for(String key : mp.keySet()){
            System.out.printf("age of %s is %d\n",key,mp.get(key));
        }

        System.out.println();

        for(Map.Entry<String,Integer> e : mp.entrySet()){
              System.out.printf("age of %s is %d\n",e.getKey(),e.getValue());

        }

        System.out.println();

      //  for( var e : mp.entrySet()){
        //      System.out.printf("age of %s is %d\n",e.getKey(),e.getValue());

        //}








    }

    public static void main(String[] args) {
        hashmapmethod();
        
    }
}