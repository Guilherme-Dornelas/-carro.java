package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {


    public void escolaCdastro(){

        String nome;

        // instaciar Veiculos!
        Funcionario objFuncionario = new Funcionario();

        Cliente objCliente = new Cliente();
        Scanner teclado = new Scanner(System.in);


        System.out.println("-----------ola, seja bem vindo!-----------------");
        System.out.println("quem e voce?");
        nome = teclado.next();

        if (nome.equals("Cliente")){
            objCliente.CadastroClient();

        } else if (nome.equals("Funcionario")) {
            objFuncionario.CadastroFuncionario();
        }else {
            System.out.println("voce nao pode realizar a atividade de cadastro !");
        }

    }


}
