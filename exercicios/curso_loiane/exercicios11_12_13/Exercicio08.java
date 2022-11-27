package exercicios.curso_loiane.exercicios11_12_13;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Quanto você ganha por hora? ");
        int ganha = scanner.nextInt();
        System.out.println("Quantas horas por mês você trabalha?");
        int trabalha = scanner.nextInt();

        int salario = ganha * trabalha;

        System.out.println("Seu salario e de: " + salario);
        scanner.close();
    }
}
