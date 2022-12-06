package exercicios.curso_loiane.exercicios17;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas turmas tem na escola? ");
        int turmas = scanner.nextInt();
        System.out.println("Qunatos alunos tem em cada turma? ");
        int alunos = scanner.nextInt();
        int media = (turmas + alunos) / 2;
        if (alunos < 40) {
            System.out.println("O numero medio de alunos por turma: " + media);
        }else{
            System.out.println("Não aceitamos turmas com mais de 40 alunos");
        }
        scanner.close();
    }
}
