import java.io.IOException;

public class e1017 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a, b;
        double c, d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = (a * b);
        d = c / 12;
        System.out.format("%.3f%n" , d);

    }
}