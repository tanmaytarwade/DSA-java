class tanmay {
    void arraymethod() {
        //find maximum mumber
        int[] ages = {1, 2, 3, 4, 5, 11, 7, 8, 9, 10};
        int ans = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > ans) {
                ans = ages[i];
            }
        }
        System.out.println(ans);
    }
}

public class array5 {
    public static void main(String[] args) {
        tanmay obj = new tanmay();
        obj.arraymethod();
    }
}

