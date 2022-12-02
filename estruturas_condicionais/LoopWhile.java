package estruturas_condicionais;

public class LoopWhile {
    public static void main(String[] args) {
        int cont = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (cont <= max) {
            System.out.println(cont);
            cont++; //cont = cont + 1 
        }
        System.out.println(cont);

        // do {
        //     cont ++;
        //     System.out.println(cont);
        // } while (cont < 15);
    }
}
