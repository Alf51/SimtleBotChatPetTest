import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can do it!
        ArrayList<String> arrayPeople = new ArrayList<>(8);
        for (int i = 7; i >= 0; i--) {
            arrayPeople.add(scanner.next());
        }
        for (int i =  arrayPeople.size() - 1; i >= 0; i--) {
            System.out.println(arrayPeople.get(i));
        }
    }
}