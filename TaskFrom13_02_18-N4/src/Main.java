import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        int array[] = new int[n];
        fillArray(array);
        print(array);

        int k = 4; // опорный элемент

        int i = 0;
        int j = array.length-1;
        while (i < j) {
            if (array[i] <= k && array[j] >= k) {i++; j--;}
            else if (array[i] >= k && array[j] <= k) {
                int p = array[i];
                array[i] = array[j];
                array[j] = p;
                i++; j--;
            }
            else if (array[i] > k) j--;
            else i++;
        }

        print(array);
    }

    public static void print(int matrix[]) {
        for (int j = 0; j < matrix.length; ++j) {
            System.out.print(matrix[j] + " | ");
        }
        System.out.println();
    }

    public static void fillArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
    }

}
