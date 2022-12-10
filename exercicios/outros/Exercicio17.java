package exercicios.outros;

import java.util.Arrays;

public class Exercicio17 {
    public static void main(String[] args) {
        int[] valores = new int[]{2, 56, 47};

        Arrays.sort(valores);

        for (int i : valores) {
            System.out.println(i);
        }
        System.out.println();
    }
}
//?Crie uma função que recebe um array de 3 números e coloque eles em ordem crescente. Crie sua própria função para isso.