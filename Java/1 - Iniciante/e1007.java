import java.io.IOException;

public class e1007 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a, b, c, d, e;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        e = a * b - c * d;
        System.out.println("DIFERENCA = " + e);

    }
}