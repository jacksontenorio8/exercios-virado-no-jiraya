package br.com.jacksontenorio8.Modulo1;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pi = 3.141592654;
        System.out.println("Digite o raio da circunferência da lata em cm: ");
        double R = teclado.nextDouble();
        System.out.println("Digite a altura da lata cm: ");
        double A = teclado.nextDouble();

        double V = pi * (Math.pow(R, 2)) * A;

        System.out.println(String.format("V = %.2f cm3", V));
    }
}
