package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Veiculo {


    // Declarar as variaveis
    String modelo, marca, cor, combustivel;
    int ano;
    double valor;
    Scanner Teclado = new Scanner(System.in);
    public void Cadastrarveiculo(){
        System.out.println("Cadastar Veiculo!");
        System.out.println("informe qual a marca: ");
        marca = Teclado.next();
        System.out.print("informe um modelo: ");
        modelo = Teclado.next();
        System.out.print("informe o ano ");
        ano = Teclado.nextInt();
        System.out.print("informe a cor: ");
        cor = Teclado.next();
        System.out.print("infrome o combustivel: ");
        combustivel = Teclado.next();
        System.out.print("imforme o valor: ");
        valor = Teclado.nextDouble();

        System.out.println("cadastro finalizado!");
    }

    public void ListarVeiculos(){
}
};
