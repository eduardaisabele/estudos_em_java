package pratica.scanner;
import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Entre com seu nome: ");
        str = texto.nextLine();
        System.out.println("Bem-vindo " + str);

        System.out.println("digite um numero ");
        int numero = texto.nextInt();
        System.out.println("o numero digitado foi: " + numero);

        texto.close();
    }
}
