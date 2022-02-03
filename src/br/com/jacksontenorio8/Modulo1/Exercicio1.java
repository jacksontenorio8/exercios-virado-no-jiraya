package br.com.jacksontenorio8.Modulo1;
import java.util.Scanner;
import java.lang.Math;
// Área do Círculo

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pi = 3.141592654;
        double raio = teclado.nextDouble();
        double area = pi * (Math.pow(raio,2));

        System.out.println(String.format("A = %.2f", area));
    }

}
