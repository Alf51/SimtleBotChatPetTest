import java.util.Scanner;

class Main {
    static final int GREATE_LIMIT = 10_000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        if (squirrels < GREATE_LIMIT && nuts < GREATE_LIMIT) {
            System.out.println(nuts % squirrels);
        }
    }
}