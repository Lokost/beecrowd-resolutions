import java.io.IOException;

public class e1011 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double R, pi, V;
        R = scan.nextDouble();
        pi = 3.14159;
        V = 4.0/3.0 * (R*R*R) * pi;
        System.out.format("VOLUME = %.3f%n", V);

    }
}