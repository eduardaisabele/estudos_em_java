package exercicios.curso_loiane.exercicios24_25.lampada;

public class Lampada {
    String fabricante;
    String modelo;
    String tensao;
    String cor;
    String tipoLamp;
    String[] estilo;
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }

    void moostrarEstado(){
        if (ligada) {
            System.out.println("A lampada esta ligada!");
        }else {
            System.out.println("A lampada esta desligada!");
        }
    }

    void mudarEstado(){
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
