import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra: ");
        String texto = sc.nextLine();


        contagemDeVogais(texto);
        contagemEspacosVazios(texto);

    }

    public static void contagemDeVogais(String texto){
        int contador = 0;
        String vogais = "aeiouAEIOU";



        int contadorVogais = 0;
        int contadorConsoantes = 0;


        for (int i = 0; i < texto.length(); i++) {
            char v = texto.charAt(i);
            if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u' || v=='A' || v=='E' ||
                    v=='I' || v=='O' || v=='U' || v=='0' || v=='é' || v == 'É' || v == 'Ã' ||
                    v == 'ã' || v == 'â' || v == 'Â' || v == 'ô' || v == 'Ô' || v == 'ó' || v == 'Ó'){
                contadorVogais++;
            }
            else if (v != ' ') {
                contadorConsoantes++;
            }
        }
        System.out.println("Quantidade de vogais: " + contadorVogais);
        System.out.println("Quantidade de consoantes: " + contadorConsoantes);
    }

    public static void contagemEspacosVazios(String texto){
        int contadorVazios = 0;
        for (int i = 0; i < texto.length(); i++) {
            char v = texto.charAt(i);
            if(v == ' ' ){
                contadorVazios++;
            }
        }
        System.out.println("Quantidade de espaços vazios: " + contadorVazios);
    }
}
