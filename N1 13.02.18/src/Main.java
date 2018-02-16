public class Main {
    final static int n = 5;
    final static int m = 6;
    public static void main(String[] args) {
        int matrix[][] = new int[n][m];
        fill(matrix);
        print(matrix);

        /** Алгоритм упорядоченного спуска */
        int p = matrix[n-1][m-1];
        for (int i = n-1; i >= 0; i--) {
            for (int k = m-1; k > 0; k--)
                matrix[i][k] = matrix[i][k-1];
            if (i != 0) matrix[i][0] = matrix[i-1][m-1];
        }
        matrix[0][0] = p;

        System.out.println();
        print(matrix);
    }

    public static void fill(int matrix[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random()*10);
            }
        }
    }
    public static void print(int matrix[][]) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
