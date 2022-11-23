package pratica.getset;

import java.util.Scanner;

public class InstanciaFutebol {
    public static void main(String[] args) {
        String time;
        Futebol torcida = new Futebol();
        Scanner texto = new Scanner(System.in);

        System.out.println("Para qual time voce torce? " );
        time = texto.nextLine();

        torcida.setNomeTime(time);
        torcida.mostraTime();

        texto.close();
    }
}
