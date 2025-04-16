import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        do {
            contador++;
            System.out.println("Digite um numero: ");
            soma += sc.nextInt();
        }
        while (contador < 50);

        System.out.println("A média aritmética dos valores inseridos é: " + soma/50);
    }
    }

