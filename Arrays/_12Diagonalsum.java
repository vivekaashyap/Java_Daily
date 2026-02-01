
public class _12Diagonalsum {

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - i - 1];
        }
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2]; // agar matrix ki length odd hogi toh middle element do baar add ho jaega
        }
        System.out.println(sum);
    }
}
