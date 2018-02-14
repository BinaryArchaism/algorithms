public class Main {
    public static void main(String[] args) {
        int k = 4; // опорный элемент
        int array[] = {14,16, k, 1, 3}; // количество = 11

        print(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < k) {
                int j = array[i];
                array[i] = array[array.length-1 - i];
                array[array.length-1 - i] = j;
            }
        }

        print(array);
    }

    public static void print(int matrix[]) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[j] + " | ");
            }
        System.out.println();
    }
}
