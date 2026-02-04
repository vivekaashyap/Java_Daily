
import java.util.Scanner;

public class _4Spriral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int strow = 0, edrow = 3, stcol = 0, edcol = 3;
        while (strow <= edrow && stcol <= edcol) {
            for (int j = stcol; j <= edcol; j++) {
                System.out.print(matrix[strow][j] + " ");
            }
            for (int j = strow + 1; j <= edrow; j++) {
                System.out.print(matrix[j][edcol] + " ");
            }
            for (int j = edcol - 1; j >= stcol; j--) {
                if (strow == edrow) {
                    break;
                }
                System.out.print(matrix[edrow][j] + " ");
            }
            for (int j = edrow - 1; j >= strow + 1; j--) {
                if (stcol == edcol) {
                    break;
                }
                System.out.print(matrix[j][stcol] + " ");
            }
            strow++;
            stcol++;
            edrow--;
            edcol--;
        }
        System.out.println();
    }
}
