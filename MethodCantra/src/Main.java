/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */

public class Main {
    public static void main(String[] args) {

        int n = 6; //размер матрицы
        int matrix[][] = new int[n][n];
        int h = 2;

        matrix[0][0] = 1;
        for (int k = 1; k < n; ++k) {
            if (k%2 != 0) {
                for (int i = 0; i < k; ++i) {
                    matrix[i][k] = h;
                    ++h;
                }
                matrix[k][k] = h;
                ++h;
                for (int i = 0; i < k; ++i) {
                    matrix[k][i] = h;
                    ++h;
                }
            } else {
                for (int i = 0; i < k; ++i) {
                    matrix[k][i] = h;
                    ++h;
                }
                matrix[k][k] = h;
                ++h;
                for (int i = 0; i < k; ++i) {
                    matrix[i][k] = h;
                    ++h;
                }
            }
        }

        print(matrix);
    }

    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}