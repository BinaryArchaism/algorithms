public class Main {
    public static void main(String[] args) {

    }

    public static void number1() {
        final int n = 4;
        int coins[] = {1, 5, 10, 25};
        int count = 78;
        int countofcoins = 0;
        for (int i = n - 1; i >= 0; i--) {
            countofcoins = count / coins[i];
            count = count % coins[i];
            System.out.println(countofcoins + " по " + coins[i]);
        }
    }

}
