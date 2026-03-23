
import java.util.*;

public class _04ReverseString {

    public static void reverse(String str) {
        Stack<Character> s = new Stack<>();
        int inx = 0;
        while (inx < str.length()) {
            s.push(str.charAt(inx));
            inx++;
        }
        // System.out.println(s);
        // while (!s.isEmpty()) {
        //     System.out.print(s.pop());
        // }
        StringBuilder res = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            res.append(curr);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String str = "wei";
        reverse(str);
    }
}
