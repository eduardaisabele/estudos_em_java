package treinando_classes.classe_carro;

import exercicios.curso_loiane.exercicios24_25.lampada.Lamp01;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double cansumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * cansumoCombustivel + " km");
    }

    double obterAutonomia() { //double e o tipo de dado que ira retornar;
        System.out.println("Metodo obterAutonomia foi chamado");
        return capacidadeCombustivel * cansumoCombustivel;
    }

    double calcularCombustivel(double km){
        double quantidadeCombustivel = km/cansumoCombustivel;
        return quantidadeCombustivel;
    }
}

