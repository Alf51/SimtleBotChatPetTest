import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DO IT !
        String firstName = scanner.next();
        int yearsOfExperience = scanner.nextInt();
        String cuisinePreference = scanner.next();
        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks" +
                " %s dishes and has %d years of experience.", firstName, cuisinePreference, yearsOfExperience);
    }
}