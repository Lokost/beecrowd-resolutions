import java.io.IOException;

public class e1015 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a, b, c, d, e;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();

        e = Math.sqrt(((c - a) * (c - a)) + ((d - b) * (d - b)));
        System.out.printf("%.4f%n" , e);

    }
}