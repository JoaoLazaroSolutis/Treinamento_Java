import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira palavra: ");
        String Palavra1 = sc.nextLine();
        System.out.println("Digite a segunda palavra: ");
        String Palavra2 = sc.nextLine();

        List<String> palavras = new ArrayList<String>();
        palavras.add(Palavra1);
        palavras.add(Palavra2);

        palavras.sort(String::compareTo);
        palavras.forEach(System.out::println);

        if(Palavra1.length() > Palavra2.length()){
            System.out.println("A palavra " + Palavra1 + " é maior que a palavra " + Palavra2 + ".");
        } else if (Palavra1.length() < Palavra2.length()){
            System.out.println("A palavra " + Palavra2 + " é maior que a palavra " + Palavra1 + ".");
        } else {
            System.out.println(" As palavras: " + Palavra1 + "," + Palavra2 +  " possuem o mesmo tamanho!");
        }

    }
}
