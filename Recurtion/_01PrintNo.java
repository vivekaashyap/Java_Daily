
public class _01PrintNo {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
    }

    public static void print(int n) {
        // if (n == 6) {
        //     return;
        // }
        print(n - 1);
        System.out.println(n);
    }
}
