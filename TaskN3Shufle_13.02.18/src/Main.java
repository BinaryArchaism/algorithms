public class Main {
    public static void main(String[] args) {
        int n = 10; //количесвто элементов в массиве
        int array[] = new int[n];
        for (int i = 1; i <= n; i++) {  // заполнение массива от 1 до n
            array[i-1] = i;
        }

        print(array);
        shufle1(array);
        print(array);
        shufle2(array);
        print(array);
        shufle3(array);
        print(array);
    }

    public static void shufle1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int r = (int) (Math.random() * arr.length);
            int j = arr[i];
            arr[i] = arr[r];
            arr[r] = j;
        }
    }

    public static void shufle2(int[] arr) {
        int random = (int) (Math.random() * arr.length);
        for (int k = 0; k <= random; k++) {
            int j = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1] = j;
        }
    }

    public static void shufle3(int arr[]) {
        int random = (int) (Math.random() * arr.length);
        for (int k = 0; k <= random; k++) {
            for (int i = 0; i < arr.length/2; i++) {
                int r = (int) (Math.random() * arr.length);
                int j = arr[i];
                arr[i] = arr[r];
                arr[r] = j;
            }
            int j = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1] = j;
        }
    }

    public static void print(int matrix[]) {
        for (int j = 0; j < matrix.length; ++j) {
            System.out.print(matrix[j] + " | ");
        }
        System.out.println();
    }
}
