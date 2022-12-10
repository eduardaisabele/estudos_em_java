package Arrays;

public class Arrays {
    public static void main(String[] args) {
        double[] temperatura = new double[36];
        temperatura[0] = 30.1;
        temperatura[1] = 31.7;
        temperatura[2] = 32.5;
        temperatura[3] = 33.;

        System.out.println("Temperatura do dia um e de: " + temperatura[1]);

        System.out.println("O tamanho do array: " + temperatura.length);

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é de :" + temperatura[i]);
        }

        for (double temp : temperatura) {
            System.out.println(temp);
        }
    }
}
