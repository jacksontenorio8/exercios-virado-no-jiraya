package br.com.jacksontenorio8.Aula;

/*
Dado um determinado número inteiro, imprima se ele é ímpar ou par.
*/

public class NumeroParImpar {
    public static void main(String[] args) {
        int numero;

        numero = 72;

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é: PAR.");
        }else {
            System.out.println("O número " + numero + " é: ÍMPAR.");
        }
    }
}
