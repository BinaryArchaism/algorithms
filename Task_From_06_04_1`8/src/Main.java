/**
 * @author Dmitrii "BinaryArchaism" Dmitriev
 */

public class Main {
    public static void main(String[] args) {
        int n = 6;
        int matrix[][] = new int[n][n];

        int h = 1;
        //заполнение первой половины + побочной диагонали
        for (int k = n - 1; k >= 0; --k) {
            for (int i = n-k-1; i >= 0; --i) {
                //меняй местами [][], чтобы изменить направление заполнения
                if (k%2!=0)
                    matrix[i][n-k-i-1] = h;
                else
                    matrix[n-k-i-1][i] = h;
                ++h;
               }
        }

        //заполнение второй половины без побочной диагонали
//        for (int k = n - 1; k > 0; --k) {
//            for (int i = n-k; i < n; ++i) {
//                //if (k%2!=0)
//                    matrix[k+1-i][i] = h;
//                    print(matrix);
//                //else
//                  //  matrix[i][k] = h;
//                ++h;
//            }
//        }

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
