import java.io.IOException;

public class e1151 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), ax = 0, ay = 1, sum = 0;
        if (n >= 0) {
            System.out.print(ax);
        }
        for (int i =1; i < n; i++) {
            sum = ax + ay;
            System.out.print(" " + ay);
            ax = ay;
            ay = sum;
        }

    }
}