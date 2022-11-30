package exercicios.outros;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double tempCelcius = scanner.nextDouble();
        System.out.println("Temperatura em celcius e de: " + tempCelcius);

        double tempFahrenheit = (9 * tempCelcius + 160) / 5;
        System.out.println("Temperatura convertida para fahrenheit: " + tempFahrenheit);
        scanner.close();
    }
}

//?Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:  F=(9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
