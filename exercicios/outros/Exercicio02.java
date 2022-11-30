package exercicios.outros;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int somaValores = valor1 + valor2;
        int subtraiValores = valor1 - valor2;
        int multiplicaValor = valor1 * valor2;
        int divideValor = valor1 / valor2;

        System.out.println(valor1 + " + " + valor2 + " = " + somaValores);
        System.out.println(valor1 + " - " + valor2 + " = " + subtraiValores);
        System.out.println(valor1 + " * " + valor2 + " = " + multiplicaValor);
        System.out.println(valor1 + " / " + valor2 + " = " + divideValor);

        scanner.close();
    }
}

//?Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos 


