package exercicios.curso_loiane.exercicios24_25.lampada;

public class Lamp01 {
    public static void main(String[] args) {
        Lampada lamp01 = new Lampada();
        lamp01.fabricante = "Intelbras";
        lamp01.modelo = "EWS 410";
        lamp01.tensao = "110 Volts, 220 Volts";
        lamp01.cor = "branca";
        lamp01.tipoLamp = "LED";  
        
        lamp01.estilo = new String[1];
        lamp01.estilo[0] = "Moderno";

        lamp01.ligar();
        lamp01.moostrarEstado();
        lamp01.desligar();
        lamp01.moostrarEstado();
    }

    
}
