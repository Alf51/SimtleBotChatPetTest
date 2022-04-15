import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int limitNumber = 4;
        ArrayList<Integer> arrayNumber = new ArrayList<>(limitNumber);
        while (scanner.hasNextInt()) {
            arrayNumber.add(scanner.nextInt());
        }
        for (Integer integer : arrayNumber) {
            int decrementCount = integer;
            --decrementCount;
            System.out.printf("%d ", decrementCount);
        }
    }
}