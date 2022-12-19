package exercicios.curso_loiane.exercicios24_25.aluno;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDiciplinas = new double[3][4];

    void mostraeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do curso: " + curso);

        for (int i = 0; i < notasDiciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDiciplinas[i].length; j++) {
                System.out.println(notasDiciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    boolean verificarAprovado(int indice) {
        if (obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }

    double obterMedia(int indice){
        double soma = 0;

        for (int i = 0; i < notasDiciplinas[indice].length; i++) {
            soma += notasDiciplinas[indice][i];
        }
        double media = soma / 4;

        return media;
    }
}
