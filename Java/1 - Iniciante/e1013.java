import java.io.IOException;

public class e1013 {

    public static void main(String[] args) throws IOException {

            java.util.Scanner scan = new java.util.Scanner(System.in);
            int a, b, c;
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            int ab = (a + b + Math.abs(a - b)) / 2;
            int abc = (ab + c + Math.abs(ab - c)) / 2;
            System.out.println(abc + " eh o maior");

    }
}