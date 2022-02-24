package br.com.jacksontenorio8.Modulo1;

/*
Desenvolva uma rotina que dado um número inteiro qualquer calcule seu antecessor e seu sucessor.
*/
public class Exercicio18 {
    public static void main(String[] args) {
        int numero, antecessor, sucessor;

        numero = 7;
        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Antecessor = " + antecessor + "\n" + "Sucessor = " + sucessor);
    }
}
