package exercicios.curso_loiane.exercicios14_15;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = scanner.next();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":System.out.println("vogal"); break;
            default: System.out.println("consoante");
        }
        scanner.close();
    }
}

//?Faça um programa que verifique se uma letra digitada é vogal ou consoante
