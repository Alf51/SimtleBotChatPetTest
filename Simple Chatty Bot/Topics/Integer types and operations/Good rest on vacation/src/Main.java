import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int priceFood = scanner.nextInt();
        int priceFlight = scanner.nextInt();
        int hotelPrice = scanner.nextInt();
        final int fullPrice = day * priceFood + priceFlight * 2 + --day * hotelPrice;
        System.out.println(fullPrice);
    }
}
