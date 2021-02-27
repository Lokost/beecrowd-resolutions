import java.io.IOException;

public class e1051 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        double a = in.nextDouble(), b = 0, c = 0;
        if (a >= 0 && a <= 2000) {
            System.out.println("isento");
        } else if (a > 2000 && a <= 3000) {
            c = a - 2000;
            b += c * 0.08;
            System.out.format("R$ %.2f%n" , b);
        } else if (a > 3000 && a <= 4500) {
            b = 1000 * 0.8;
            c = a - 3000;
            b += c * 0.18;
            System.out.format("R$ %.2f%n" , b);
        } else if (a > 4500) {
            b = 1000 * 0.8 + 1500 * 0.18;
            c = a - 4500;
            b += c * 0.18;
            System.out.format("R$ %.2f%n" , b);
        }

    }
}