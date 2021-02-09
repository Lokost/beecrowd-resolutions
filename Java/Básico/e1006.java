import java.io.IOException;

public class e1006 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a, b, c, d;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.printf("MEDIA = %.1f%n" , d);

    }
}