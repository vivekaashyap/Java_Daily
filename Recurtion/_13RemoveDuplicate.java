
public class _13RemoveDuplicate {

    public static void remove(String str, int i, StringBuilder newStr, boolean[] map) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true) {
            remove(str, i + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            remove(str, i, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        remove(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
