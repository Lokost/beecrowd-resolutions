import java.io.IOException;

public class e1005 {
    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f%n" , c);

    }
}