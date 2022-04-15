import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();
        int deskForClass1 = class1 % 2 == 0 ? class1 / 2 : class1 / 2 + 1;
        int deskForClass2 = class2 % 2 == 0 ? class2 / 2 : class2 / 2 + 1;
        int deskForClass3 = class3 % 2 == 0 ? class3 / 2 : class3 / 2 + 1;
        System.out.println(deskForClass1 + deskForClass2 + deskForClass3);
    }
}
