import java.util.Scanner;

class Main {
    private static final int LARGER = 1;
    private static final int PERFECT = 0;

    public static void main(String[] args) {
        int countLarger = 0;
        int countSmaller = 0;
        int countPerfect = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = scanner.nextInt(); i > 0; i--) {
            int detector = scanner.nextInt();
            if (detector == LARGER) {
                ++countLarger;
            } else if (detector == PERFECT) {
                ++countPerfect;
            } else {
                ++countSmaller;
            }
        }
        System.out.printf("%d %d %d", countPerfect, countLarger, countSmaller);

    }
}