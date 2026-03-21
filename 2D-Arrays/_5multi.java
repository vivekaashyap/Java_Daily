
import java.util.Scanner;

public class _5multi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] arr1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        if (m != n1) {
            System.out.println("Multiplication not possible");
            return;
        }
        // 2*3 == 3*2
        int result[][] = new int[n][m1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m1; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
