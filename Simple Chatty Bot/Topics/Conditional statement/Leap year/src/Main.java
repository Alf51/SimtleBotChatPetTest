import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(new java.util.Scanner(System.in).nextInt(), 1, 1).isLeapYear()
                        ? "Leap" : "Regular");
    }
}