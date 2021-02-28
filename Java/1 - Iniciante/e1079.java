import java.io.IOException;

public class e1079 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i <= x; i++) {
            double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
            double media = (a * 2 + b * 3 + c * 5) / 10;
            System.out.format("%.1f%n" , media);
        }

    }
}