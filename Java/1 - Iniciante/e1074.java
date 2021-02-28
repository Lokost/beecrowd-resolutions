import java.io.IOException;

public class e1074 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n, x;
        String pn = "", pi = "";
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            x = in.nextInt();
            if (x > 0) {
                pn = "POSITIVE";
            } else if (x < 0) {
                pn = "NEGATIVE";
            }

            if (x %2 == 0) {
                pi = "EVEN";
            } else {
                pi = "ODD";
            }

            if (x == 0) {
                System.out.println("NULL");
            } else {
                System.out.println(pi + " " + pn);
            }


        }

    }
}