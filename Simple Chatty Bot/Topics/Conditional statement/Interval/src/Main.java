import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean condition1 = number > -15 && number <= 12;
        boolean condition2 = number > 14 && number < 17;
        boolean condition3 = number >= 19;

        System.out.println(condition1 || condition2 || condition3 ? "True" : "False");
    }
}