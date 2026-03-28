
public class _05Transpose {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 1}, {1, 4, 5, 6}, {1, 7, 8, 9}, {1, 1, 1, 1}};//3*4
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int left = 0, right = mat.length - 1;
            while (left <= right) {
                int temp = mat[left][right];
                mat[left][right] = mat[right][left];
                mat[right][left] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
