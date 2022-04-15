import java.util.Scanner;

class Main {
    private static final int SOTKA = 100;
    private static final int TEN = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumAllDigit(scanner.nextInt()));
    }

    public static int sumAllDigit(int threeDigitInt) {
        return threeDigitInt / SOTKA + threeDigitInt / TEN % TEN + threeDigitInt % TEN;
    }
}
