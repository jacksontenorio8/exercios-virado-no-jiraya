package br.com.jacksontenorio8.Aula;
/*
* Crie uma variável que ira guardar o valor de um salário, sendo os valores das porcentagens:
* 30%
* 15%
* 5%
* A cada vez que você calcular guarde o resultado em uma variável
* Imprima o resultado e reutilize a variável que guarda o resultado para o novo calculo, repetindo o processo.
* */

public class PorcentagemSalario {
    public static void main(String[] args) {

        double salario = 5000;
        double resultado = salario * 0.3;
        System.out.println("30% é: " + resultado);
        resultado = salario * 0.15;
        System.out.println("15% é: " + resultado);
        resultado = salario * 0.05;
        System.out.println("5% é: " + resultado);
    }
}
