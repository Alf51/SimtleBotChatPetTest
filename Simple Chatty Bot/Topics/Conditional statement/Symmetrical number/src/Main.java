class Main {
    public static void main(String[] args) {
        String fourNumber = new java.util.Scanner(System.in).next();
        System.out.println(fourNumber.equals(new StringBuilder(fourNumber).reverse().toString()) ? 1 : 0);
    }
}