import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You my best friend )
        int n = scanner.nextInt();
        final int result = ((n + 1) * n + 2) * n + 3;
        System.out.println(result);
    }
}
