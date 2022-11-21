package pratica.metodos_parametros;

public class MandaMensagem {
    public void enviaMensagem() {
        System.out.println("Olá estou proticando ;)");
    }
    public void mandaOutraMensagem(String nome){
        System.out.println("Vamos praticar tambem, " + nome);
    }

    public void mensagemComDoisParametros(String nome, int idade) {
        System.out.printf("ola, %s, voce tem %d anos de idade", nome, idade);
    }
}
