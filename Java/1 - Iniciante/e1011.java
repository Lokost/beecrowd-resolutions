import java.io.IOException;

public class e1011 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a;
        double b;
        a = scan.nextInt();
        b = ((4.0 / 3.0) * 3.14159 * (a * a * a));
        System.out.printf("VOLUME = %.3f%n" , b);

    }
}