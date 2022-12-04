package exercicios.curso_loiane.exercicios17;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //valida nome: maior que 3 caracteres;
        boolean validaNome = false;
        do {
            System.out.println("Digite o nome: ");
            String nome = scanner.next(); 

            if (nome.length() > 3) {
                validaNome = true;
                System.out.println("Nome valido, continue.");
            }else {
                System.out.println("Nome invalido, digite novamente");
            }
        } while (!validaNome);

        //valida idade: entre 0 e 150;
        boolean validaIdade = false;
        do {
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();

            if (idade > 0 && idade < 150) {
                validaIdade = true;
                System.out.println("Idade valida, continue.");
            }else{
                System.out.println("Idade invalida, digite novamente");
            }
        } while (!validaIdade);

        //valida salario: maior que zero;
        boolean validaSalario = false;
        do {
            System.out.println("Digite o salario: ");
            double salario = scanner.nextDouble();
            
            if (salario > 0) {
                validaSalario = true;
                System.out.println("Salario valido, continue.");
            } else {
                System.out.println("Salario invalido, digite novamente");
            }
        } while (!validaSalario);

        //valida sexo: 'f' ou 'm';
        boolean validaSexo = false;
        do {
            System.out.println("Digite 'F' para feminino e 'M' para masculino: ");
            String sexoFouM = scanner.next();

            boolean feminino = sexoFouM.equalsIgnoreCase("F");
            boolean masculino = sexoFouM.equalsIgnoreCase("M");
            if (feminino || masculino) {
                validaSexo = true;
                System.out.println("Sexo valido, continue.");
            }else {
                System.out.println("Sexo invalido, digite novamente");
            }
        } while (!validaSexo);

        //valida estado civil: solteiro, casado, viuvo(a), divorciado(a);
        boolean validaEstadoCivil = false;
        do {
            System.out.println("Digite o estado civil 'S', 'C', 'V', 'D'");
            String estadoCivil = scanner.next();

            boolean solteiro = estadoCivil.equalsIgnoreCase("S");
            boolean casado = estadoCivil.equalsIgnoreCase("C");
            boolean viuvo = estadoCivil.equalsIgnoreCase("V");
            boolean divorciado = estadoCivil.equalsIgnoreCase("D");
            boolean todosEstadosCivis = solteiro || casado || viuvo || divorciado;

            if (todosEstadosCivis) {
                validaEstadoCivil = true;
                System.out.println("Estado civil valido!");
            } else {
                System.out.println("Estado civil invalido, digite novamente.");
            }
        } while (!validaEstadoCivil);
        scanner.close();
    }
}