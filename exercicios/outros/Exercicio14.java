package exercicios.outros;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        int quantPrestacoes = 5;
        double valorPrestações = valorProduto / quantPrestacoes;

        System.out.println("O valor das prestacoes e de: " + valorPrestações);

        scanner.close();
    }
}

//?A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um programa que receba um valor de uma compra e mostre o valor das prestações. 