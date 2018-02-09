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

        for (int k = n - 1; k > 0; --k) {
            for (int i = n-k; i <= k; ++i) {
                //меняй местами [][], чтобы изменить направление заполнения
                //if (k%2!=0)
                    matrix[k-i+1][i] = h;       //[good][ERROR]
                //else
                //    matrix[n-k-i][i] = h;
                ++h;
            }
        }

//        for (int k = 1; k < n; ++k) {
//            for (int i = n-1; i > n-i+k-1; --i) {
//                matrix[i][i-n+k+1] = h;                 //[проблем нет][ошибка]
//                ++h;
//            }
//        }

//        int k = n-1;
//
//        for (int j = 1; j < n; ++j) {
//            int i = n-k;
//            matrix[k][i] = h;
//            ++h; --k;
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
