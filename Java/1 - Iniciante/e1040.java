import java.io.IOException;

public class e1040 {

    public static void main(String[] args) throws IOException {

        // Wrong Answer (Problema desconhecido)

        java.util.Scanner scan = new java.util.Scanner(System.in);
        double n1 = scan.nextDouble(), n2 = scan.nextDouble(), n3 = scan.nextDouble(), n4 = scan.nextDouble();
        double m1 = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4)) / 10.0;
        System.out.printf("Media: %.1f%n" , m1);

        if (m1 >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (m1 < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (m1 >= 5.0 && m1 <= 6.9){
            System.out.println("Aluno em exame.");
            double n5 = scan.nextDouble();
            System.out.printf("Nota do exame: %.1f%n" , n5);
            double m2 = (n5 + m1) / 2;
            if (m2 >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n" , m2);
        }

    }
}