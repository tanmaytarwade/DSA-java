//Given 2 integers a and b. swap the 2 given values using sum and difference methods
public class array20 {
       public static void main(String[] args) {
        int a =10;
        int b = 20;

        a =  a + b;
        b = a-b;
        a = a-b;

        System.out.println("a"+" "+a);
        System.out.println("b"+" "+b);
}
}
