package br.com.jacksontenorio8.Modulo1;
import java.lang.Math;

/*
Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado, ao cubo e a 10,
apresentar também a soma total dos três resultados anteriores.
*/
public class Exercicio10 {
    public static void main(String[] args) {
        double numero, a, b, c, soma;

        numero = 2;
        a = Math.pow(numero, 2);
        b = Math.pow(numero, 3);
        c = Math.pow(numero, 10);
        soma = a + b + c;

        System.out.println("O valor do número elevado ao quadrado é: " + a);
        System.out.println("O valor do número elevado ao cubo é: " + b);
        System.out.println("O valor do número elevado a 10 potência é : " + c);
        System.out.println("A soma total dos três resultados anteriores é: " + soma);

    }
}
