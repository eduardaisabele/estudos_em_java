package exercicios.outros;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Salario do vendedor: ");
        double salarioVendedor = scanner.nextDouble();

        System.out.println("Quanto em R$ foi efetuadas no mês: ");
        int vendasMes = scanner.nextInt();
        System.out.println(vendasMes);

        double percentual = 15.0 / 100.0;
        double valorComissao = salarioVendedor + (percentual * salarioVendedor);
        System.out.println("O salario final do vendedor " + nomeVendedor + " e de R$" + valorComissao);

        scanner.close();
    }
}


//?4.Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
