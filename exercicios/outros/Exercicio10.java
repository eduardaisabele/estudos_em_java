package exercicios.outros;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        int diasVividos = idade * 365;
        System.out.println(nome + ", você ja viveu " + diasVividos + " dias");
        scanner.close();
    }
}

//?Escreva um programa em java para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui. Considere sempre anos completos, e que um ano possui 365 dias. 
// 1 = 365
// idade = x