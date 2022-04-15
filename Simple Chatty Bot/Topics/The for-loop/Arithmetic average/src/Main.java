import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int divisible = 3;
        int countNumersFromDivisible = 0;
        int starSeqence = scanner.nextInt();
        int endSeqence = scanner.nextInt();
        double resultAverage = 0;

        for (int i = starSeqence; i <= endSeqence; i++) {
            if (i % divisible == 0) {
                resultAverage += i;
                ++countNumersFromDivisible;
            }
        }

        System.out.println(resultAverage / countNumersFromDivisible);
    }
}