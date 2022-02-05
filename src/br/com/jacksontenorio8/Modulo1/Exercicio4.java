package br.com.jacksontenorio8.Modulo1;
import java.io.IOException;
import java.util.Scanner;

//programa que realize a conversão de graus Fahrenheit (F) para graus Celsius (C).

public class Exercicio4 {
    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);

        double F = teclado.nextDouble();
        double C = ((F - 32) * 5) / 9;

        System.out.println(String.format("Temperatura em Graus Celcius: %.2f",C));
    }
}
