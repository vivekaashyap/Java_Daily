
import java.util.Arrays;

public class _2LowerToUpper {

    public static void main(String[] args) {
        String str = "hi, i am shradha";
        String[] str1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length; i++) {
            sb.append(Character.toUpperCase(str1[i].charAt(0)))
              .append(str1[i].substring(1))
              .append(" ");
        }        
        System.out.print(sb.toString().trim());
    }
}
