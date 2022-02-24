package br.com.jacksontenorio8.Modulo1;

/*
Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm, desenvolva um programa que leia uma medida em pés e calcule o
equivalente em metros.
*/
public class Exercicio17 {
    public static void main(String[] args) {
        float ft, medida, m;

        ft = 0.3048F;
        medida = 50F;
        m = medida / ft;
        System.out.println(String.format("A medida em metros é: %.2f metros", m));

    }
}
