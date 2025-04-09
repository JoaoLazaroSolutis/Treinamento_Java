import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int A = entrada.nextInt();

        System.out.println("Insira o valor de B:");
        int B = entrada.nextInt();

        System.out.println("Valores de A e B Originais: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        int C = A;

        System.out.println("Valores de A e B Trocados: ");
        A = B;
        System.out.println("A = " + A);

        B = C;
        System.out.println("B = " + B);

    }
}