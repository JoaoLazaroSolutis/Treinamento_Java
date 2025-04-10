import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 2; i <= numero; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }

    }

}
