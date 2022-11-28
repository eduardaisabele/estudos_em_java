package exercicios.outros;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro salario: ");
        double salario1 = scanner.nextDouble();

        System.out.println("Digite o segundo salario: ");
        double salario2 = scanner.nextDouble();

        System.out.println("Digite o terceiro salario: ");
        double salario3 = scanner.nextDouble();

        System.out.println("Digite o quarto salario: ");
        double salario4 = scanner.nextDouble();

        double mediaSalario = (salario1 + salario2 + salario3 + salario4) / 4;

        System.out.println("A media salarial desta empresa e de " + mediaSalario);

        scanner.close();
    }
}


//?Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial. Vamos declarar as variáveis de quatro salários dos funcionários e da média como double e definir alguns valores para cada um dos salários. Em seguida, vamos calcular a média dos mesmos, para isso, basta somar todos os salários e dividir pela quantidade de funcionários (que serão 4). Para finalizar, é só exibir a média na tela!