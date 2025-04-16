import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de milhas: ");
        double milhas = sc.nextInt();
        double KM = 1.609;

        double conversao = (milhas * KM);

        System.out.println("A conversão de Milhas para Quilômetros é: " + conversao + " Quilômetros");


    }
}
