//given an unsorted array of interger nums, return the length of the longest consecutive element squence
//this answer is submitted on leetcode
import java.util.*;
public class question {
    public int longestconsecutive(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums) st.add(num);
        int maxStreak =0;

        for(int num : st){
            if(!st.contains(num-1)){//  num is starting point of sequence
                int currNum = num;//1
                int currstreak = 1;//length of current consecutive sequence 
                while (st.contains(currNum+1)) {
                    currstreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak,currstreak);


            }

        }
        return maxStreak;
    }
}
