public class Main {
    public static void main(String[] args) {
        int n = 10; //количесвто элементов в массиве
        int array[] = new int[n];
        for (int i = 1; i <= n; i++) {  // заполнение массива от 1 до n
            array[i-1] = i;
        }

        print(array);
        shufle(array);
        print(array);
        shufle(array);
        print(array);
        shufle(array);
        print(array);
    }

    public static void shufle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int r = (int) (Math.random() * arr.length);
            int j = arr[i];
            arr[i] = arr[r];
            arr[r] = j;
        }
    }

    public static void print(int matrix[]) {
        for (int j = 0; j < matrix.length; ++j) {
            System.out.print(matrix[j] + " | ");
        }
        System.out.println();
    }
}
