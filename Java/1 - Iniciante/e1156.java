// Funcional do beecrowd
public class e1156 {
        public static void main(String[] args) {
            double S = 1.0, A = 1.0, B = 1.0;

            while (A <= 39) {
                A += 2.0;
                B *= 2.0;
                S += A / B;
            }

            System.out.printf("%.2f\n", S);
        }
}
