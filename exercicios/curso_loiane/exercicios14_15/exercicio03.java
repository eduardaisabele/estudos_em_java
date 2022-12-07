package exercicios.curso_loiane.exercicios14_15;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com uma letra (F  ou M):");
        String inputString = scanner.next();

        if (inputString.equalsIgnoreCase("f")) {
            System.out.println("f - feminino");
        }else if (inputString.equalsIgnoreCase("m")) {
            System.out.println("m - masculino");
        }else {
            System.out.println("sexo invalido");
        }
        scanner.close();
    }
}
