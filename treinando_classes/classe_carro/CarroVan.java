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
        
    }
}
