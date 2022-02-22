package br.com.jacksontenorio8.Modulo1;

/*
Elaborar um programa que realize a conversão de R$ para US$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.
*/
public class Exercicio12 {
    public static void main(String[] args) {
        double USD, BRA;

        BRA = 3;
        USD = 3 / 5.06;
        System.out.println(String.format("O valor em dolar é US$: %.2f", USD));
    }
}
