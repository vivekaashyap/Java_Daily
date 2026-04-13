
import java.util.*;

public class _04ReverseString {

    // public static void reverse(String str) {
    //     Stack<Character> s = new Stack<>();
    //     int inx = 0;
    //     while (inx < str.length()) {
    //         s.push(str.charAt(inx));
    //         inx++;
    //     }
    //     StringBuilder res = new StringBuilder("");
    //     while (!s.isEmpty()) {
    //         char curr = s.pop();
    //         res.append(curr);
    //     }
    //     System.out.println(res);
    // }

    public static void main(String[] args) {
        String str = "wei";
        reverse(str);
    }

    public static void reverse(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        // 
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        System.out.print(sb);
    }
}
