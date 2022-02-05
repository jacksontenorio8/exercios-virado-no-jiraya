package br.com.jacksontenorio8.Modulo1;
import java.io.IOException;
import java.util.Scanner;

//Programa que realize a conversão de graus Celsius (C) para graus Fahrenheit (F).

public class Exercicio3 {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        double C = teclado.nextDouble();
        double F = (9 * C) / 5;

        System.out.println(String.format("Temperatua em grau Fahrenhit: %.1f", F));
    }
}
