import java.io.IOException;

public class e1045 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble(), l1 = 0.0, l2 = 0.0, l3 = 0.0;
        if (a >= b && a >= c) {
            l1 = a;
            if (b >= c) {
                l2 = b;
                l3 = c;
            } else {
                l2 = c;
                l3 = b;
            }
        } else if (b >= a && b >= c) {
            l1 = b;
            if (a >= c) {
                l2 = a;
                l3 = c;
            } else {
                l2 = c;
                l3 = a;
            }
        } else if (c >= a && c >= b) {
            l1 = c;
            if (a >= b) {
                l2 = a;
                l3 = b;
            } else {
                l2 = b;
                l3 = a;
            }
        } else if (a == b && b == c) {
            l1 = a;
            l2 = b;
            l3 = c;
        }

        a = l1;
        b = l2;
        c = l3;

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((a * a) == (b * b) + (c * c)) {
            System.out.println("TRIANGULO RETANGULO");
        } else if ((a * a) > (b * b) + (c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((a * a) < (b * b) + (c * c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || c == a) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}