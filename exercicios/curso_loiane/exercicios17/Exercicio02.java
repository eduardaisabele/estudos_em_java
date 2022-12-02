package exercicios.curso_loiane.exercicios17;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;
        boolean infoValidas = false;
        do {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
    
            System.out.println("Digite sua senha: ");
            senha = scanner.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Digite novamente");
            }else {
                infoValidas = true;
                System.out.println("Senha e nome valido!");
            }
        } while (!infoValidas);

    


        scanner.close();
    }
}

//?Faça um programa que leia um nome do usuario e a sua senha e nao aceite a senha igual ao nome do usuario, mostrando uma mensagem de erro e voltadno a pedir as informações.
