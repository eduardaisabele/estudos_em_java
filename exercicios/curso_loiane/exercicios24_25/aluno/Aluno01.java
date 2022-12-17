package exercicios.curso_loiane.exercicios24_25.aluno;

import java.util.Scanner;

public class Aluno01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno01 = new Aluno();

        System.out.println("Entre com o nome: ");
        aluno01.nome = scanner.next();

        System.out.println("Entre com o nome do curso: ");
        aluno01.curso = scanner.next();

        System.out.println("Entre com a matricula: ");
        aluno01.matricula = scanner.nextInt();

        for (int i = 0; i < aluno01.nomeDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina: " + i);
            aluno01.nomeDisciplinas[i] = scanner.next();
        }

        for (int i = 0; i < aluno01.notasDiciplinas.length; i++) {
            System.out.println("Obtendo notas da diciplina  " + aluno01.nomeDisciplinas[i]);
            for (int j = 0; j < aluno01.notasDiciplinas[i].length; j++) {
                System.out.println("Entre com a nota: " + (j+1));
                aluno01.notasDiciplinas[i][j] = scanner.nextDouble();
            }
        }

        aluno01.mostraeInfo();
        scanner.close();
    }
}
