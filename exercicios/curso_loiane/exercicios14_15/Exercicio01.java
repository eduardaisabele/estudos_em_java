package exercicios.curso_loiane.exercicios14_15;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.print("n" + i + ": ");
        int numero = scanner.nextInt();
        int maior = numero;
        for (i = 2; i <= 2; i++) {
            System.out.print("n" + i + ": ");
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior numero e o " + maior);
    }
}

//?Faça um programa que peça dois numeros e imprima o maior deles.
