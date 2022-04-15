import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(extractingSubstring(scanner.next(), scanner.nextInt(), scanner.nextInt()));
    }

    public static String extractingSubstring(String ourString, int count1, int count2) {
        final int startIndex = Math.min(count1, count2);
        final int endIndex = Math.max(count1, count2) + 1;

        return ourString.substring(startIndex, endIndex);

    }
}