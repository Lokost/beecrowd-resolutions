import java.io.IOException;

public class e1017 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a, b;
        double c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = (a * b) / 12.0;
        System.out.printf("%.3f" , c);

    }
}