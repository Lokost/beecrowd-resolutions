import java.io.IOException;

public class e1002 {
    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a, b;
        a = scan.nextDouble();
        b = 3.14159 * (a * a);
        System.out.printf("A=%.4f%n" , b);

    }
}