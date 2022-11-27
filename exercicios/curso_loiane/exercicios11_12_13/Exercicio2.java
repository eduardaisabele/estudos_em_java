//?program que peça um numero e mostra na tela o numero

package exercicios.curso_loiane.exercicios11_12_13;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        System.out.println("O número digitado foi: " + numero);

        scanner.close();

    }
}
