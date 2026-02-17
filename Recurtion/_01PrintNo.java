
public class _01PrintNo {

    public static void main(String[] args) {
        int n = 5;
        print(n);   // calling function
    }

    // prints numbers from 1 to n using recursion
    public static void print(int n) {

        // BASE CONDITION (Stopping condition)
        if (n == 0) {
            return;
        }

        // Recursive call
        print(n - 1);

        // Work
        System.out.println(n);
    }
}
