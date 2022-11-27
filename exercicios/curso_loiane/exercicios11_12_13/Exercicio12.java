package exercicios.curso_loiane.exercicios11_12_13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a sua altura: ");
        double alturaPessoa = scanner.nextDouble();
        double pesoIdeal = (72.7 * alturaPessoa) - 58;
        System.out.println("O seu peso ideal seria: " + pesoIdeal);

        scanner.close();
    }
}
