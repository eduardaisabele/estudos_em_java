package exercicios.outros;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite o preço do carro no preço de fabrica");
        // double precoCarro = scanner.nextDouble();

        // double percentualDistribuidor = precoCarro + ((28.0 / 100.0) * precoCarro);
        // double percentualImpostos = precoCarro + (( 45.0 / 100.0) * precoCarro);
        // double precoFinal = percentualDistribuidor + percentualImpostos;

        // System.out.println("O preço final do carro sera de: " + precoFinal);
        // System.out.println("Somando 45% de impostos e 28% do distribuidor");
        // scanner.close();

        double precoCarro, precoFinal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de fábrica do veículo: R$ ");
        precoCarro = entrada.nextDouble();

        precoFinal = precoCarro + precoCarro*0.28 + precoCarro*0.45;

        System.out.println("O preço que o consumidor deve pagar pelo veículo é de: R$ " + precoFinal);
        entrada.close();
    }
}

//? O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.