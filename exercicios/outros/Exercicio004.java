package exercicios.outros;

public class Exercicio004 {
    public static void main(String[] args) {
        double alturaParede, larguraPareede, alturaAzulejo, larguraAzulejo, quantidadeAzulejos;
        alturaParede = 3.0;
        larguraPareede = 6.0;
        alturaAzulejo = 0.35;
        larguraAzulejo = 0.3;
        quantidadeAzulejos = (alturaParede * larguraPareede) / (alturaAzulejo * larguraAzulejo);
        System.out.println(quantidadeAzulejos);
    }
}
