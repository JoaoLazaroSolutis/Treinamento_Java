import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
    calculoDaAreaDoCirculo();
    }

    public static void calculoDaAreaDoCirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextInt();
        double area = Math.PI * Math.pow(raio,2);

        System.out.println("o resultado da área é: " + Math.round(area));
    }
}
