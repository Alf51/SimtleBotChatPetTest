import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(chocolateLine(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    public static String chocolateLine(int xCoordinate, int yCoordinate, int blockChokolade) {

        int square = xCoordinate * yCoordinate;

        for (int i = square; i > 0; i -= xCoordinate) {
            if (i == blockChokolade) {
                return "YES";
            }
        }

        for (int i = square; i > 0; i -= yCoordinate) {
            if (i == blockChokolade) {
                return "YES";
            }
        }
        return "NO";
    }
}