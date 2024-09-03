//IMP QUESTION
//reverse the array  consisting of integer value
public class array21 {
    
    static int[] reverse(int[] array) {
        int n = array.length;
        int[] ans = new int[n];
        int j = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = array[i];
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; 
        int[] ans = reverse(array1);
        
        for (int i = 0; i < ans.length; i++) { // Fix loop condition
            System.out.println(ans[i]); // Print each element of the reversed array
        } 
    }
}
