//find the unique number in the given array where all the elements are being repeated twice with one value being unique
/* IMP question 
 answer with logic 
 1]traverse all the pairs
 2]equal pairs -> marks -1
 3] again traverse the array marks ans variable as -1 to store the answer and return the answer
 */
public class array15{
    static int uniquenumber(int[] array) {
        for(int i =0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                     //this is also call array mainpulation(change the elements in arrays)
                    array[i] = -1;
                    array[j]= -1;

                }
                
            }
            
        }
        int ans = -1;
        for(int i =0;i<array.length;i++){
            if(array[i] > 0){
                ans = array[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,3,2,1};
        System.out.println(uniquenumber(array1));

    }
}
