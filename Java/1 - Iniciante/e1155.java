// Funcional no beecrowd
public class e1155 {
    public static void main(String[] args) {
        double S = 1.0;

        for (double i = 2.0; i <= 100.0; i++) {
            S = S + 1/i;
        }

        System.out.printf("%.2f\n", S);
    }
}
