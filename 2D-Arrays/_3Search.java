
public class _3Search {

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key = 0;
        search(mat, key);
    }

    public static void search(int mat[][], int key) {
        int row = 0;
        int col = mat[0].length - 1;
        while (row < mat.length && col >= 0) {
            if (mat[row][col] == key) {
                System.out.println(row + " " + col);
                return;
            } else if (mat[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
    }
}
