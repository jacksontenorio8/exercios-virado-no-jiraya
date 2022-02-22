package br.com.jacksontenorio8.Modulo1;

/*
Elaborar um programa que realize a conversão de US$ para R$, o programa deve saber qual o valor da cotação do
dólar e fazer a conversão.
*/
public class Exercicio11 {
    public static void main(String[] args) {
        double USD, BRA;

        USD = 3;
        BRA = USD * 5.06;

        System.out.println(String.format("O valor em Reais é R$: %.2f", BRA));
    }
}
