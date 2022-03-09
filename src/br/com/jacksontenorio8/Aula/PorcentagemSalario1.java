package br.com.jacksontenorio8.Aula;
import java.util.Scanner;

public class PorcentagemSalario1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        double novoSalario1 = 4500 + (4500 * 0.3);
        double novoSalario2 = 4500 + (4500 * 0.15);

        if(salario > 4500) {
            System.out.println(novoSalario1);
        }else{
            System.out.println(novoSalario2);
        }
    }
}
