import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculatingSleep(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public static void calculatingSleep(int minSleep, int maxSleep, int ourSleep) {
        System.out.println(ourSleep < minSleep ?
                           "Deficiency" : ourSleep > maxSleep ?
                           "Excess" : "Normal");
    }
}