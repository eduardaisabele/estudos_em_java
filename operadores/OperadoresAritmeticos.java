package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 12 + 8;
        System.out.println(resultado);

        resultado = resultado-1;
        System.out.println(resultado);

        resultado = resultado*2;
        System.out.println(resultado);

        resultado = resultado/9;
        System.out.println(resultado);

        resultado = resultado%7;
        System.out.println(resultado);

        System.out.println(resultado++);
        resultado++;
        resultado = resultado +1;
        
        System.out.println(++resultado);
        resultado = resultado +=1;

        System.out.println(resultado--);
        System.out.println(--resultado);
    }
}
