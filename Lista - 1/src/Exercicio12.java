

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        List<Float> resultadoVeiculos = new ArrayList<Float>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de veículos para os cálculos: ");
        int quantidadeCarros = sc.nextInt();

        for (int i = 0; i <= quantidadeCarros - 1; i++) {
            System.out.println("Digite a quantidade de quilômetros dirigidos (Por carro): ");
            int quantidadeKm = sc.nextInt();

            System.out.println("Digite a quantide de litros consumidos (Por carro): ");
            int quantidadeLitros = sc.nextInt();

            float KmPorLitro = quantidadeKm / quantidadeLitros;
            resultadoVeiculos.add(KmPorLitro);
        }

        System.out.println("<----- Resultados ----->");
        System.out.println("km/Litro (Por carro)");
        for (int j = 0; j <= resultadoVeiculos.size(); j++) {
            System.out.println(resultadoVeiculos.get(j));
        }
    }
}