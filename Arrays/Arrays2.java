package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] valores = new int[5];

        //atribuindo valor ao array;
        valores[0] = 1;
        valores[1] = 56;
        valores[2] = 78;
        valores[3] = 16;
        valores[4] = 10;

        //mostras todos os elementos do array;
        for (int i : valores) {
            System.out.print(i + ", ");
        }

        //somar os elementos;
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        System.out.println("O total é: " + total);

    }
}
