import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MIN_VALUE;
        final int four = 4;
        int elementSeqenc = scanner.nextInt();

        for (int i = 0; i < elementSeqenc; i++) {
            int count = scanner.nextInt();
            if (count % four == 0 && count > minValue) {
                minValue = count;
            }
        }

        System.out.println(minValue);
    }
}