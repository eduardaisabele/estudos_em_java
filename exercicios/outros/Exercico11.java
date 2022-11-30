package exercicios.outros;

import java.util.Scanner;

public class Exercico11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com a sua genero: ");
        String generoPessoa = scanner.next();

        System.out.println("Entre com a sua altura: ");
        double alturaPessoa = scanner.nextDouble();

        double pesoIdeal;
        if (generoPessoa = feminino) {
            pesoIdeal = (62.1 * alturaPessoa) - 44.7;
            System.out.println("O seu peso ideal seria: " + pesoIdeal);
        }else if (generoPessoa = masculino) {
            pesoIdeal = (72.7 * alturaPessoa) - 58;
            System.out.println("O seu peso ideal seria: " + pesoIdeal);
        }
        
        scanner.close();
    }
}