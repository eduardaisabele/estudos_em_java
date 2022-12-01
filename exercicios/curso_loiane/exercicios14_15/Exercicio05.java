package exercicios.curso_loiane.exercicios14_15;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n1: ");
        double notaUm = scanner.nextDouble();
        System.out.println("n2: ");
        double notaDois = scanner.nextDouble();

        double media = (notaUm + notaDois) / 2;
        System.out.println(media);

        if (media >= 7) {
            System.out.println("Aprovado!!");
        }else if (media <= 7) {
            System.out.println("Reprovado");
        }else {
            System.out.println("Aprovado com Distinção");
        }

        scanner.close();
    }
}
//?Faça um programa para a leitura de duas notas parciais de um aluno
