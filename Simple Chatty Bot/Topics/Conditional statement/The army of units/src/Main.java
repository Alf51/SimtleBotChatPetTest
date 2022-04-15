class Main {
    private static final int PACK = 20;
    private static final int THRONG = 250;
    private static final int ZOUNDS = 999;

    public static void main(String[] args) {
        System.out.println(armyCounting(new java.util.Scanner(System.in).nextInt()));
    }

    public static String armyCounting(int contArmy) {
        if (contArmy < 1) {
            return "no army";
        } else if (contArmy < PACK) {
            return "pack";
        } else if (contArmy < THRONG) {
            return "throng";
        }  else if (contArmy <= ZOUNDS) {
            return "zounds";
        } else {
            return "legion";
        }
    }
}