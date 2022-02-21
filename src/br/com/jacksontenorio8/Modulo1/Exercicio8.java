package br.com.jacksontenorio8.Modulo1;
/*
*Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:
𝑃 = 𝑉𝐴𝐿𝑂𝑅 + (𝑉𝐴𝐿𝑂𝑅 × (𝑇𝐴𝑋𝐴 ÷ 100) × 𝑇𝐸𝑀𝑃𝑂).
* Onde P é o valor da prestação em atraso.
*/

public class Exercicio8 {
    public static void main(String[] args) {

        double VALOR = 1200.58, TAXA = 0.33;
        int TEMPO = 45;
        double P = VALOR + (VALOR * (TAXA / 100) * TEMPO);

        System.out.println(String.format("%.2f", P));
    }

}
