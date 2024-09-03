/* java program to reverse each word in string 
 for e.g i am tanmay
 = i ma yamnat
*/
public class stringbuilder2 {
    public static void main(String[] args) {
        String s = "i am tanmay";
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                sb.append(ch);

            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb =new StringBuilder(" ");




            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    

    }
    
}
