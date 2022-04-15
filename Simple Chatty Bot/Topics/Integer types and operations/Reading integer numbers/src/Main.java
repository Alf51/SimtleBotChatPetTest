import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayForNumber = new ArrayList<>();
        while (scanner.hasNextInt()) {
            arrayForNumber.add(scanner.nextInt());
        }
        for (int number : arrayForNumber) {
            System.out.println(number);
        }        
    }
}
