import java.io.IOException;

public class e1042 {

    public static void main(String[] args) throws IOException {

        // Funcional no URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int A, B, C;
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        if (A > B && A > C && B > C) {
            System.out.format("%d%n%d%n%d%n", C, B, A);
        } else if (A > B && A > C && B < C) {
            System.out.format("%d%n%d%n%d%n", B, C, A);
        } else if (B > A && B > C && A > C) {
            System.out.format("%d%n%d%n%d%n", C, A, B);
        } else if (B > A && B > C && C > A) {
            System.out.format("%d%n%d%n%d%n", A, C, B);
        } else if (C > B && C > A && A > B) {
            System.out.format("%d%n%d%n%d%n", B, A, C);
        } else {
            System.out.format("%d%n%d%n%d%n", A, B, C);
        }
        System.out.format("%n%d%n%d%n%d%n", A , B , C);
    }
}