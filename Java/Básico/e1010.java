import java.io.IOException;

public class e1010 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a, b, d, e;
        double c, f, t1, t2;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextDouble();
        d = scan.nextInt();
        e = scan.nextInt();
        f = scan.nextDouble();

        t1 = b * c;
        t2 = e * f;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", t1 + t2);

    }
}