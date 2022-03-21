package br.com.jacksontenorio8.Aula;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        int idade = 34;
        String nome = "Jackson";

        if (idade < 11) {
            System.out.println(nome + " participará da categoria Infantil.");
        } else if (idade >= 11 && idade < 16) {
            System.out.println(nome + " participará da categoria Juvenil.");
        } else if (idade >= 16 && idade < 19) {
            System.out.println(nome + " participará da categoria Pré-adulto.");
        } else {
            System.out.println(nome + " participará da categoria Adulto.");
        }
    }
}
