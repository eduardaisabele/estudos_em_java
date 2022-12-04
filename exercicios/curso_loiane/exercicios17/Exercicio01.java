package exercicios.curso_loiane.exercicios17;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean notaValida = false;
        
        do {
            System.out.println("Digite um numero entre 0 e 10: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 10) {
                notaValida = true;
                System.out.println("Numero aprovado!");
            }else {
                System.out.println("Número invalido");
            }   
        } while (!notaValida);
        scanner.close();
    }
}

//?Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja invalido e continue pedindo ate que o usuario informe um valor valido.