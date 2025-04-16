import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra para verificar se é um Palíndromo: ");
        String texto = sc.nextLine();

        PalavraInvertida(texto);
    }

    public static void PalavraInvertida(String palavra) {

        var palavraInvertida = new StringBuilder(palavra).reverse().toString();
        if (palavraInvertida.equals(palavra)) {

            System.out.println("A palavra " + palavra + " é um Palíndromo, invertida ela seria: "
                    + palavraInvertida);
        } else {
            System.out.println("A palavra inserida não é um Palíndromo!");
        }
    }
}
