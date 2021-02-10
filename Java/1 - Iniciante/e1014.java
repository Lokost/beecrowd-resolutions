import java.io.IOException;

public class e1014 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a;
        double b, c;
        a = scan.nextInt();
        b = scan.nextDouble();
        c = a / b;
        System.out.printf("%.3f km/l%n" , c);

    }
}