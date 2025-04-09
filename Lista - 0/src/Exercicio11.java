import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do produto: ");
        int codigo = sc.nextInt();

        if (codigo == 001){
            System.out.println("Produto: Parafuso" );
        } else if (codigo == 002){
            System.out.println("Produto: Porca" );
        } else if ( codigo == 003){
            System.out.println("Produto: Prego" );
        } else {
            System.out.println("Diversos");
        }
    }
}
