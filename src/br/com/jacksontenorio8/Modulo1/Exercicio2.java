package br.com.jacksontenorio8.Modulo1;
import java.util.Scanner;

//Salário base e Salário líquido

/*
sb = Salário Base
ht = Horas Trabalhadas
vh = Valor Hora de trabalho
td = Total de Descontos
pd = Percentual de Desconto
sl = Salário Líquido
*/

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sb, td, sl;


        int ht = 220;
        double vh = 8.25;
        double pd = 11;

        sb = (ht * vh);
        td = (pd / 100) * sb;
        sl = sb - td;
        System.out.println(String.format("Salário Base = %.2f", sb));
        System.out.println(String.format("Salário Líquido = %.2f", sl));
    }
}
