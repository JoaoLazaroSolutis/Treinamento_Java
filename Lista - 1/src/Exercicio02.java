import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = sc.nextInt();

        if(numero1 > numero2){
            System.out.println("O maior número é o primeiro número inserido, Número: " + numero1);
        } else if (numero1 < numero2){
            System.out.println("O maior número é o segundo número inserido, Número:  " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
    }

}
