
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Insira o valor inteiro:");
            int A = entrada.nextInt();

            if (A %2 != 0) {
                System.out.println("o valor: " + A + " é impar!");
            } else {
                System.out.println("O valor: " + A + " é par!");
            }

        }
    }

