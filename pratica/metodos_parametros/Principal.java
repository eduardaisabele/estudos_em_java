package pratica.metodos_parametros;

public class Principal {
    public static void main(String[] args) {
         String nomeAluno = "Lucas";
         int idadeAluno = 10;

         MandaMensagem oi = new MandaMensagem();
         System.out.println("Nome do aluno: " + nomeAluno);

         System.out.println("Idade do aluno: " + idadeAluno);
         oi.mandaOutraMensagem(nomeAluno);
         oi.mensagemComDoisParametros(nomeAluno, idadeAluno);
    }
}
