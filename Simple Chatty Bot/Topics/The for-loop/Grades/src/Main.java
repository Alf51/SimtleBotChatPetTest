import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endSeqence = scanner.nextInt();
        int cuntD = 0;
        int cuntC = 0;
        int cuntB = 0;
        int cuntA = 0;

        for (int i = 0; i < endSeqence; i++) {
            switch (scanner.next().charAt(0)) {
                case 'A' -> ++cuntA;
                case 'B' -> ++cuntB;
                case 'C' -> ++cuntC;
                case 'D' -> ++cuntD;
                default -> { }
            }
        }
        System.out.printf("%s %s %s %s", cuntD, cuntC, cuntB, cuntA);
    }
}