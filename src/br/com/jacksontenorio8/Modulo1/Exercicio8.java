package br.com.jacksontenorio8.Modulo1;
/*
*Calcular e apresentar o valor de uma prestaΓ§Γ£o em atraso, utilize a fΓ³rmula abaixo:
π = ππ΄πΏππ + (ππ΄πΏππ Γ (ππ΄ππ΄ Γ· 100) Γ ππΈπππ).
* Onde P Γ© o valor da prestaΓ§Γ£o em atraso.
*/

public class Exercicio8 {
    public static void main(String[] args) {

        double VALOR = 1200.58, TAXA = 0.33;
        int TEMPO = 45;
        double P = VALOR + (VALOR * (TAXA / 100) * TEMPO);

        System.out.println(String.format("%.2f", P));
    }

}
