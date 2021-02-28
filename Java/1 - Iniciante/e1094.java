import java.io.IOException;

public class e1094 {

    public static void main(String[] args) throws IOException {

        // Funcional do URI
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt(), q, co = 0, ra = 0, sa = 0;
        double p, p_co, p_ra, p_sa, soma = 0;
        String t, por = "%";
        for (int i = 1; i <= n; i++) {
            q = in.nextInt();
            t = in.next();
            if (t.equals("C")) {
                co += q;
            } else if (t.equals("S")) {
                sa += q;
            } else if (t.equals("R")) {
                ra += q;
            }
            soma += q;
        }
        p = 100.00 / soma;
        p_co = p * co;
        p_ra = p * ra;
        p_sa = p * sa;

        System.out.printf("Total: %.0f" , soma);
        System.out.print(" cobaias\n");
        System.out.print("Total de coelhos: " + co + "\n");
        System.out.print("Total de ratos: " + ra + "\n");
        System.out.print("Total de sapos: " + sa + "\n");
        System.out.printf("Percentual de coelhos: %.2f" , p_co);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", p_ra);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", p_sa);
        System.out.print(" %\n");


    }
}