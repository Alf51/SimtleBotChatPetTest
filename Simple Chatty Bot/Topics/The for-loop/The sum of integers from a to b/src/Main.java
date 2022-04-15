import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countA = scanner.nextInt();
        int countB = scanner.nextInt();
        int result = 0;

        for (int i = countA; i <=  countB; i++) {
            result += i;
        }
        System.out.println(result);
    }
}