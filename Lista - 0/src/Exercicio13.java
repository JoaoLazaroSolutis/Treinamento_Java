import java.util.List;

public class Exercicio13 {
    public static void main(String[] args) {


        for (int i = 1; i <= 6; i++){
            int dado1 = i;
            for (int j = 1; j <= 6; j++){
                int dado2 = j;
                int soma = dado1 + dado2;
                if(soma ==7){
                    System.out.println("Somando " + dado1 + " e " + dado2 + " a soma deles é: " + soma);
                }
            }
        }
    }

}
