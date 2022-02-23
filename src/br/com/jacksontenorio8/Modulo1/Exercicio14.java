package br.com.jacksontenorio8.Modulo1;

/*
Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente o resultado das quatro operações aritméticas
básicas (adicao, subtracao, multiplicacao e divisao).
*/
public class Exercicio14 {
    public static void main(String[] args) {
        int a, b, adicao, subtracao, multiplicacao, divisao;

        a = 10;
        b = 5;
        adicao = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;

        System.out.println("Adição = " + adicao + "\n" + "Subtração = " + subtracao +"\n" + "Multiplicação = " + multiplicacao + "\n" + "Divisão = " + divisao);

    }
}
