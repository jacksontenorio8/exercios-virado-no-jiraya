package br.com.jacksontenorio8.Aula;

public class PorcentagemSalario3 {
    public static void main(String[] args) {
        double salario = 4700.50;
        double resultado = 0;
        String porcentagem = "";

        if (salario > 4500) {
            resultado = 4500 + (4500 * 0.3);
            porcentagem = "30%";
        } else {
            resultado = 4500 + (4500 * 0.15);
            porcentagem = "15%";
        }
        System.out.println("O valor final em porcentagem de " + porcentagem +  " é: " + resultado);
    }
}
