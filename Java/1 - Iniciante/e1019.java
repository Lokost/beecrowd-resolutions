import java.io.IOException;

public class e1019 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int h = a / (60 * 60);
        a -= h * (60 * 60);
        int m = a / 60;
        a -= m * 60;

        System.out.printf("%d:%d:%d%n" , h, m, a);


    }
}