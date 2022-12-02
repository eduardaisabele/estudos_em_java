package estruturas_condicionais;

public class For {
    public static void main(String[] args) {
        //for positivo
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        //for negativo
        for (int i = 6; i > 0; i--) {
            System.out.println(i);
        }

        //for com duas variaveis
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        //for partes ausentes
        int i = 0;
        for ( ; i < 10; ) {
            System.out.println(i);
            i += 2;
        }

        
        
    }
}
