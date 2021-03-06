public class Main {
    public static void main(String[] args) {
        int n = 5;
        int matrix[][] = new int[n][n];
        fillArray(matrix);
        print(matrix);

        taskSecond(matrix);
        print(matrix);

    }

    public static void taskSecond(int[][] matrix) {
        int n = matrix.length;
        if (n%2!=0) n++;
        int[] arr = new int[n];
        for (int i = 0; i < matrix.length; i+=2) {
            arr[i] = i/2+1;
            arr[i+1] = i/2+1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int p = 1; p <= arr[i]; p++) {
                if (i % 2 == 0) {
                    int j = matrix[matrix.length - 1][i];
                    for (int k = matrix.length - 2; k >= 0; k--) {
                        matrix[k + 1][i] = matrix[k][i];
                    }
                    matrix[0][i] = j;
                }
                else {
                    int j = matrix[0][i];
                    for (int k = matrix.length - 2; k >= 0; k--) {
                        matrix[matrix.length - k - 2][i] = matrix[matrix.length - k - 1][i];
                    }
                    matrix[matrix.length - 1][i] = j;
                }
            }
        }
    }

    public static void taskFirst(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int p = 0; p <= i; p++) {
                if (i % 2 == 0) {
                    int j = matrix[matrix.length - 1][i];
                    for (int k = matrix.length - 2; k >= 0; k--) {
                        matrix[k + 1][i] = matrix[k][i];
                    }
                    matrix[0][i] = j;
                }
                else {
                    int j = matrix[0][i];
                    for (int k = matrix.length - 2; k >= 0; k--) {
                        matrix[matrix.length - k - 2][i] = matrix[matrix.length - k - 1][i];
                    }
                    matrix[matrix.length - 1][i] = j;
                }
            }
        }
    }

    public static void fillArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }


    public static void print(int matrix[][]) {
        System.out.println();
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
