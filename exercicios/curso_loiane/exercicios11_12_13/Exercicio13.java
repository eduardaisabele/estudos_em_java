package exercicios.curso_loiane.exercicios11_12_13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite F para feminino e M para masculino");
        String genero = scanner.next();

        if (genero.equalsIgnoreCase("F")) {
            double pesoIdealF = (62.1*altura) - 44.7;
            System.out.println("Seu peso ideal e de: " + pesoIdealF);
        }else if (genero.equalsIgnoreCase("M")) {
            double pesoIdealM = (72.7*altura) - 58;
            System.out.println("Seu peso ideal e de: " + pesoIdealM);
        }else {
            System.out.println("invalido");
        }
        scanner.close();
    }
}
