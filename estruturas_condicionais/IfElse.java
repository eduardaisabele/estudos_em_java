package estruturas_condicionais;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o preço do item");
        double valor = scanner.nextDouble();

        if (valor <= 10) {
            System.out.println("Esta barato");
        }else if (valor > 10 && valor < 15) {
            System.out.println("Voce pode pedir desconto");
        }else if(valor >= 15 && valor < 17){
            System.out.println("Pode pesquisar mais");
        }else {
            System.out.println("Mouito caro");
        }

        scanner.close();
    }
}
