
public class _1Start {

    public static void main(String[] args) {
        int a = 3, b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
