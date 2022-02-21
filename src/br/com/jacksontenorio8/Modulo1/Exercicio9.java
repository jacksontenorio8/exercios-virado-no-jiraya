package br.com.jacksontenorio8.Modulo1;

/*
Desenvolver um programa que apresente e calcule o volume de uma caixa retangular,
utilize a fórmula abaixo:
𝑉=𝐶·𝐿·𝐴
Onde:
V = Volume em 𝑐𝑚3
C = Comprimento
L = Largura
A = Altura
*/

public class Exercicio9 {
    public static void main(String[] args) {
        double C = 200, L = 50, A = 100;

        double V = C * L * A;

        System.out.println(String.format("V = %.2f", V));
    }
}
