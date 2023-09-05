package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Funcionario {
    String Nome, Email, Endereco;
    String dataNascimento;
    long telefone, cpf, rg;

    public void CadastroFuncionario(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cadastar Funcionario!");
        System.out.print("informe seu nome: ");
        Nome = teclado.next();
        System.out.print("informe seu cpf: ");
        cpf = teclado.nextLong();
        System.out.print("informe seu rg: ");
        rg = teclado.nextLong();
        System.out.print("informe a Data de nascimento: ");
        dataNascimento = teclado.next();

        System.out.print("infrome seu email: ");
        Email = teclado.next();
        System.out.print("imforme seu endereco: ");
        Endereco = teclado.next();
        System.out.print("imforme seu telefone: ");
        telefone = teclado.nextLong();

        teclado.close();

        System.out.print("cadastro finalizado!");
    }
}
