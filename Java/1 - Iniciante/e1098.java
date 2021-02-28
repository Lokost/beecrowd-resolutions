import java.io.IOException;

public class e1098 {

    public static void main(String[] args) throws IOException {

        // Em revisão (Wrong Awnser)
        float j;
        for (float i = 0; i <= 2; i += 0.2) {
            j = 1 + i;
            for (int a = 1; a <= 3; a++) {
                System.out.println("I=" + i + " J=" + j);
                j++;
            }
        }

    }
}