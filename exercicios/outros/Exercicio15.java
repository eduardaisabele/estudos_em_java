package exercicios.outros;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qualquer coisa: ");
        String caractere = scanner.nextLine();

        int tamanho = caractere.length();
        System.out.println("Quantidade de caracteres digitados: " + tamanho);

        scanner.close();
    }
}


//?Faça um programa em Java que peça ao usuário para digitar um texto e informe quantos caracteres possui o texto informado pelo usuário. (Utilize o método length()).
