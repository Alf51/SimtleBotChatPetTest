import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner сканер = new Scanner(System.in);
        считаемТреугольник(сканер.nextInt(), сканер.nextInt(), сканер.nextInt());
    }

    public static void считаемТреугольник(int сторонаА, int сторонаБ, int сторонаС) {
        boolean формула1 = сторонаА + сторонаБ > сторонаС;
        boolean формула2 = сторонаА + сторонаС > сторонаБ;
        boolean формула3 = сторонаБ + сторонаС > сторонаА;
        System.out.println(формула1 && формула2 && формула3 ? "YES" : "NO");
    }
}