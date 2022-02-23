package br.com.jacksontenorio8.Modulo1;

/*
Construa um programa que calcule a velocidade em metros por segundo de um projétil
que percorre uma distância em quilômetros a um espaço de tempo em minutos, utilize a
fórmula abaixo:
𝑉 = (𝐷 · 1000) ÷ (𝑇 · 60)
Onde:
V = Velocidade em m/s
D = Distância
T = Tempo
*/

public class Exercicio15 {
    public static void main(String[] args) {
        int D, T;
        double V;

        D = 6200;
        T = 60;
        V = (D * 1000) / (T * 60);

        System.out.println(String.format("Velocidade = %.2f m/s", V));
    }
}
