/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */

public class Main {
    public static void main(String[] args) {
        int n = 6;
        int matrix[][] = new int[n][n];

        int h = 1;
        for (int k = n - 1; k >= 0; --k) {
            if (k%2!=0) {
                for (int i = n-k; i >= 0; --i) {
                    matrix[n-k-i][i] = h;
                    ++h;
                }
            } else {
                for (int i = n-k; i >= 0; --i) {
                    matrix[i][n-k-i] = h;
                    ++h;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
