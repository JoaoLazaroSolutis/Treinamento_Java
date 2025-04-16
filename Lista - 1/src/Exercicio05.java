import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia da semana em numeral: ");
        int diaNumero = sc.nextInt();

        String dias [] = {"Domingo", "Segunda - Feira", "Terça - Feira", "Quarta - Feira",
                "Quinta - Feira", "Sexta - Feira", "Sábado"};

        if(diaNumero == 1){
            System.out.println(dias[0]);
        } else if(diaNumero == 2){
            System.out.println(dias[1]);
        } else if(diaNumero == 3){
            System.out.println(dias[2]);
        } else if (diaNumero == 4){
            System.out.println(dias[3]);
        } else if (diaNumero == 5){
            System.out.println(dias[4]);
        } else if (diaNumero == 6){
            System.out.println(dias[5]);
        } else {
            System.out.println(dias[6]);
        }
    }
}
