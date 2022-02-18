package br.com.jacksontenorio8.Aula;

/*
*Crie uma classe que calcule determina porcentagem dado salário
* Criar uma classe
* Aceitar um valor de entrada para o salário
* Definir o valor da porcentagem = 30%
* Calcular o valor da porcentagem
* */

public class CalculadoraImposto {
    public static void main(String[] args) {


        float salario = 2160.15F;
        float porcentagem = 0.3F;
        float porcentagemSalario = salario * porcentagem;
        System.out.println(String.format("Novo Salário = %.2f",porcentagemSalario));

    }
}
