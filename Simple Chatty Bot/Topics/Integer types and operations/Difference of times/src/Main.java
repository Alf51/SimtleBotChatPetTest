import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime first = LocalTime.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        LocalTime second = LocalTime.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(second.toSecondOfDay() - first.toSecondOfDay());
    }
}
