package exercicios.curso_loiane.exercicios11_12_13;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        int tempFarenheit = scanner.nextInt();

        int converterTemp = 5 * (tempFarenheit - 32) / 9;
        System.out.println("A temperatura convertida e: " + converterTemp + "°C");
        scanner.close();
    }
}
