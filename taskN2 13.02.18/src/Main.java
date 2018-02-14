public class Main {
    public static void main(String[] args) {
        int n = 5;
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        print(matrix);

        for (int i = 0; i < n; i++) {
            for (int p = 0; p <= i; p++) {
                if (i % 2 == 0) {
                    int j = matrix[n - 1][i];
                    for (int k = n - 2; k >= 0; k--) {
                        matrix[k + 1][i] = matrix[k][i];
                    }
                    matrix[0][i] = j;
                }
                else {
                    int j = matrix[0][i];
                    for (int k = n - 2; k >= 0; k--) {
                        matrix[n - k - 2][i] = matrix[n - k - 1][i];
                    }
                    matrix[n - 1][i] = j;
                }
            }
        }
        System.out.println();
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
