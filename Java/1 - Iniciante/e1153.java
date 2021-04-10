import java.io.IOException;

public class e1153 {

    public static void main(String[] args) throws IOException {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), mult = 1;
        while (n >= 1) {
            mult *= n;
            n--;
        }

        System.out.println(mult);

    }
}