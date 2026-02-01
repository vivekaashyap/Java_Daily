
public class _1Transpose {

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3}, {4, 5, 6}};
        int row = mat.length, col = mat[0].length;
        System.out.println(row + " " + col);
        int tranpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tranpose[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(tranpose[i][j]);
            }
            System.out.println();
        }

    }
}
