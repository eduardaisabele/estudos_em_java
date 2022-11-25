package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean resultado1 = (numero1 == 1) && (numero2 == 2);
        System.out.println("numero1 é 1 AND numero2 é 2 - resultado: " + resultado1);

        boolean resultado2 = (numero1 == 1) || (numero2 == 2);
        System.out.println("numero1 é 1 OR numero2 é 2 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro & falso);
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro | falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro || falso );
    }
}
