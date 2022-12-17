package treinando_classes.classe_carro;

public class CarroVan {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.cansumoCombustivel = 0.2;

        System.out.println(van);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia()  );

        double quantidadeCombustivel10 = van.calcularCombustivel(10);
        System.out.println("Qunatidade combustivel = " + quantidadeCombustivel10);
        
    }
}
