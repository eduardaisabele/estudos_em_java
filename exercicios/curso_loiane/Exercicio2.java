package exercicios.curso_loiane;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        System.out.println("O número digitado foi " + numero);

        scanner.close();

    }
}
