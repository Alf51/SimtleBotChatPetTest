import java.util.Scanner;

class Main {
    
    private static final int MAX_LIMIT_COUNT = 10000; 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        if (squirrels < MAX_LIMIT_COUNT && nuts < MAX_LIMIT_COUNT) {
            System.out.println(nuts / squirrels);
        }
    }
}
