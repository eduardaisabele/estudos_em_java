package pratica.scanner;
import java.util.Scanner;

public class ClasseScannerDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String nome = scan.next();
        System.out.println("voce digitou: " + nome);

        System.out.println("Digite algum numero: ");
        int numero = scan.nextInt();
        System.out.println("Numero digitado: " + numero);


        scan.close();
        
    }
}
