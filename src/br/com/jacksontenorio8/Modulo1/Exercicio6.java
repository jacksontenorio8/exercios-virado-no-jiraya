package br.com.jacksontenorio8.Modulo1;

/*
Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem. Sabendo que o automóvel tem uma
autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:
DT = T * V
LU = D / 12
Onde:
D = Distância em Km
T = Tempo gasto na viagem
V = Velocidade
*/

public class Exercicio6 {
    public static void main(String[] args) {
        int T = 34;
        int V = 100;

        int D = T * V;
        int LU = D / 12;

        System.out.println("Consumo = " + LU);

    }
}
