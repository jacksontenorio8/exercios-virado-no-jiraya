package br.com.jacksontenorio8.Modulo1;
import java.lang.Math;
/*
Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:

𝑉 = (4 ÷ 3)Π(𝑅3 )
Onde:
V = Volume
π = 3.141592654
R = Raio
*/
public class Exercicio16 {
    public static void main(String[] args) {
        double pi, R;
        double V;

        pi = 3.141592654;
        R = 25;
        V = (4 / 3) * pi * (Math.pow(R, 3));

        System.out.println("V = " + V);
    }
}
