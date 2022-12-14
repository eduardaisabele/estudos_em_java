package estruturas_condicionais;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];

        Random random = new Random();
        System.out.println("Usando for");

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + ", ");
        }
        
        System.out.println();
        System.out.println("Usando forEach");
        for (int i : notas) {
            System.out.print(i + ", ");
        }
    }
}
