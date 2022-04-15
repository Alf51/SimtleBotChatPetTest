import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endSequence = scanner.nextInt();
        final int six = 6;
        int result = 0;

        for (int i = 0; i < endSequence; i++) {
            int naturalNumberDivSix = scanner.nextInt();
            if (naturalNumberDivSix % six == 0) {
                result += naturalNumberDivSix;
            }
        }
        System.out.println(result);
    }
}
