package exercicios.outros;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos cavalos foram comprados?");
        int cavalosComprados = scanner.nextInt();

        int ferraduras = cavalosComprados * 2;
        System.out.println("A quantidade de ferraduras necessarias serão de " + ferraduras);

        scanner.close();
    }
}

//?Faça um programa em java para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras. A informação de cavalos comprados deve ser informada pelo usuário.
