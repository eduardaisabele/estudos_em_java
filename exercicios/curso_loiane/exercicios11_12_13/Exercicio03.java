//?Faça um program que peça dois numeros e imprima a soma

package exercicios.curso_loiane.exercicios11_12_13;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primerio numero ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numeroDois = scanner.nextInt();
        int resultado = numeroUm + numeroDois;

        System.out.println("A soma dos numeros e: " + resultado);
        scanner.close();
    }
}
