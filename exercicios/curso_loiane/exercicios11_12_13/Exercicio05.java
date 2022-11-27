//?Faça um programa que converta metros para centrimetros

package exercicios.curso_loiane.exercicios11_12_13;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Metros: ");
        double metros = scanner.nextDouble();

        double centrimetros = metros * 100;

        System.out.printf("%.1f cm", centrimetros);

        scanner.close();
    }
}
