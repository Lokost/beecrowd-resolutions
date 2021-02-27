import java.io.IOException;

public class e1048 {

    public static void main(String[] args) throws IOException {
        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        double a = in.nextDouble(), b;
        int c = 0;

        if (a >= 0 && a <= 400) {
            c = 15;
        } else if (a > 400 && a <= 800) {
            c = 12;
        } else if (a > 800 && a <= 1200) {
            c = 10;
        } else if (a > 1200 && a <= 2000) {
            c = 7;
        } else if (a > 2000) {
            c = 4;
        }

        b = (a / 100) * c;
        a += b;

        System.out.format("Novo salario: %.2f%nReajuste ganho: %.2f%n", a, b);
        System.out.println("Em percentual: " + c + " %");

    }
}