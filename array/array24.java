//.Rotate the array by 'k' steps
//logic of this ans is form college walla
public class array24 {

    static int[] Rotate(int[] array,int k){
        int n = array.length;
        k =k%n;
        int[] ans = new int[n];
        int j =0;

        for(int i=n-k;i<n;i++){
            ans[j++]=array[i];

        }
        for(int i =0;i<n-k;i++){
            ans[j++] =array[i];
        }
        return ans;


    }

public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5}; 
    int[] rotatedArray = Rotate(array1, 2); 
    for (int i = 0; i < rotatedArray.length; i++) { // Fix loop condition
        System.out.println(rotatedArray[i]); // Print each element of the reversed array
    } 

}
}
