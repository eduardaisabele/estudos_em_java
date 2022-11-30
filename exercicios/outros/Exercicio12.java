package exercicios.outros;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero ");
        int numero = scanner.nextInt();

        if (numero >= 20) {
            System.out.println("Numero aprovado!!");
        }

        scanner.close();
    }
}


//?3.Escreva um programa que entre com um número e o imprima caso seja maior do que 20