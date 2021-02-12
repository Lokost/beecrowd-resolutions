import java.io.IOException;

public class e1036 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble(), x1, x2, delta;
        delta = ((b * b) - 4.0 * a * c);
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = ((-(b) + Math.sqrt(delta)) / (2.0 * a));
            x2 = ((-(b) - Math.sqrt(delta)) / (2.0 * a));

            System.out.printf("R1 = %.5f%nR2 = %.5f%n" , x1 , x2);
        }

    }
}