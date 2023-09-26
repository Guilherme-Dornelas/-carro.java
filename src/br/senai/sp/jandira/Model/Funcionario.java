package br.senai.sp.jandira.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Funcionario {

    String Nome, Email, Endereco;
    String dataNascimento;
    long telefone, cpf, rg;

    double bonus;

    List<Funcionario> listFuncionario = new ArrayList<>();

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



        System.out.print("cadastro finalizado!");
    }

    public void funcionarioBonus(Veiculo objVeiculo){
        System.out.println("------- saudo do vendedor ---------");
        double percentual = objVeiculo.valor * 0.10;
        bonus = percentual;
    }

    public void adicionarFuncionario( Funcionario objFuncionario){
        listFuncionario.add(objFuncionario);
    }

    public void listarFuncionario(){
        for (Funcionario objFuncionario : listFuncionario){
            System.out.println(objFuncionario.Nome);
        }
    }


    public Funcionario pesquisarVendedor(String nome){
        for (Funcionario vendedor : listFuncionario){
            if (vendedor.Nome.equalsIgnoreCase(nome)){
                return vendedor;
            }
        }
        return null;
    }
}
