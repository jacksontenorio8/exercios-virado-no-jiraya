package br.com.jacksontenorio8.Aula;

public class PorcentagemSalario2 {
    public static void main(String[] args) {
        double salario = 4700.50;
        double resultado = 0;

        if (salario > 4500) {
            resultado = 4500 + (4500 * 0.3);
        } else {
            resultado = 4500 + (4500 * 0.15);
        }
        System.out.println("O valor final é: " + resultado);
    }
}
