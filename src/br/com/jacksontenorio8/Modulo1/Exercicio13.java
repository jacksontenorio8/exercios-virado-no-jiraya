package br.com.jacksontenorio8.Modulo1;

/*
Elaborar um programa que leia o salário base mensal (SB) de um funcionário e o percentual de reajuste (PR) e calcule e
apresente o novo valor de salário do funcionário. A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:
𝑁𝑆 = 𝑆𝐵 + (𝑆𝐵 * 𝑃𝑅) ÷ 100
Onde:
NS = Novo Salário
SB = Salário Base
PR = Percentual de Reajuste
*/

public class Exercicio13 {
    public static void main(String[] args) {
        float NS, SB, PR;

        SB = 2160.16F;
        PR = 0.11F;
        NS = SB + (SB* PR) / 100;
        System.out.println(String.format("Novo salário: %.2f", NS));
    }
}
