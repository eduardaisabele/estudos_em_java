package exercicios.curso_loiane.exercicios17;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada do: ");
        int numeroEscolhido = scanner.nextInt();

        System.out.println("Vai do numero: ");
        int numeroInicial = scanner.nextInt();

        System.out.println("Ate o numero: ");
        int numeroFinal = scanner.nextInt();

        for (int multiplicador = numeroInicial; multiplicador <=numeroFinal; multiplicador++) {
            int resultado = numeroEscolhido * multiplicador;
            System.out.println(numeroEscolhido + " X " + multiplicador + " = " + resultado);            
        }

        scanner.close();
    }
}
