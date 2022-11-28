package exercicios.outros;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da sua parede: ");
        double alturaParede = scanner.nextDouble();

        System.out.println("Digite a largura da sua parede: ");
        double larguraPareede = scanner.nextDouble();

        double alturaAzulejo = 0.35;
        double larguraAzulejo = 0.45;

        double quantidadeAzulejos = (alturaParede * larguraPareede) / (alturaAzulejo * larguraAzulejo);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + quantidadeAzulejos);
        System.out.println("Levando em consideração que os azulejos sejam de 0.35 x 0.45");

        scanner.close();
    }
}

//?Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.


