
public class reverse {

    public static void main(String[] args) {
        String s = "           Hello           World        ";
        String t = s.trim();
        String[] arr = t.split(" ");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            String word = arr[i];
            if (word.length() != 0) {
                res += word;
                if (i != 0) {
                    res += " ";
                }
            }
        }
        System.out.println(res);
    }
}
