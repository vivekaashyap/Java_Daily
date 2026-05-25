
public class _1Palindrome {

    public static void main(String[] args) {
        String str = "madam";
        boolean isplaindrome = true;
        int st = 0, ed = str.length() - 1;
        while (st < ed) {
            if (str.charAt(st) != str.charAt(ed)) {
                isplaindrome = false;
                break;
            }
            st++;
            ed--;
            // 
        }
        System.out.println(isplaindrome);
    }
}
