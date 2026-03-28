
public class _06Multi2D {

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3, 1}, {1, 4, 5, 6}, {1, 7, 8, 9}};//3*4
        int[][] mat2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};//4*3
        int[][] res1 = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    res1[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                System.out.print(res1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
