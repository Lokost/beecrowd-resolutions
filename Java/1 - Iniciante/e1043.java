import java.io.IOException;

public class e1043 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (Math.abs(b-c) < a && a < (b + c) && (a - c) < b && b < (a + c) && (a -b ) < c && c < (a + b)) {
            System.out.printf("Perimetro = %.1f%n" , a + b + c);
        } else {
            System.out.printf("Area = %.1f%n" , ((a + b) / 2) * c);
        }

    }
}