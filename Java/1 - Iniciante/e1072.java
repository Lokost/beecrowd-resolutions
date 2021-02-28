import java.io.IOException;

public class e1072 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n, x, i = 0, o = 0;
        n = in.nextInt();
        for (int j = 1; j <= n; j++) {
            x = in.nextInt();
            if (x >= 10 && x <= 20) {
                i++;
            } else {
                o++;
            }
        }
        System.out.println(i + " in");
        System.out.println(o + " out");

    }
}