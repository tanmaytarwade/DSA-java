//consisting of integers.return the second value that is repeating in this array.if no value is being ,return -1
import java.util.*;

public class array18 {
    static int secondRepeatedElem(int[] array) {
        int firstRepeated = -1;
        int secondRepeated = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (firstRepeated == -1) {
                        firstRepeated = array[i];
                    } else if (array[i] != firstRepeated) {
                        secondRepeated = array[i];
                        break;
                    }
                }
            }
        }

        return secondRepeated;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 3, 5, 8, 6, 7, 1, 7};
        int[] array2 = {1, 2, 4, 3, 5, 8, 6, 7};
        
        System.out.println(secondRepeatedElem(array1)); // Output: 7
        System.out.println(secondRepeatedElem(array2)); // Output: -1
    }
}



