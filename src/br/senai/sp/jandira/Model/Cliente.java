package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    String Nome, Email, Endereco;
    String dataNascimento;
    long telefone, cpf, rg;

     double dinheiroDisponivel;

    List<Cliente> listCliente = new ArrayList<>();

    public void CadastroClient() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cadastar Cliente!");
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
        System.out.println("Quanto tem para gastar?");
        dinheiroDisponivel = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("cadastro finalizado!");
    }

    public void adicionarCliente( Cliente objCliente){
        listCliente.add(objCliente);
    }

    public  void listClientes(){
        for (Cliente objCliente : listCliente){
            System.out.println(objCliente.Nome);

        }
    }

    public Cliente pesquisarComprador(String nome){
        for (Cliente cliente : listCliente){
            if (cliente.Nome.equalsIgnoreCase(nome)){
                return cliente;
            }
        }

        return null;
    }
}
