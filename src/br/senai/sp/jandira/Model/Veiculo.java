package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {

    // Declarar as variaveis
    String modelo, marca, cor, combustivel;
    int ano;
    double valor;
    Scanner Teclado = new Scanner(System.in);

    List<Veiculo> listVeiculos = new ArrayList<>();
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

    public void adicionarVeiculo(Veiculo objVeiculo){
        listVeiculos.add(objVeiculo);
    }

    public void ListarVeiculos(){
        for (Veiculo veiculo : listVeiculos){
            System.out.println(veiculo.modelo);
        }
}

public boolean pesquisarVeiculo(String modeloVeiculo) {
    for (Veiculo veiculo : listVeiculos) {
        if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)){
            return true;
        }
    }
    return false;
}

public Veiculo pesquisarVeiculocompra(String modeloVeiculo) {
    for (Veiculo veiculo : listVeiculos) {
        if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)) {
            return veiculo;
        }
    }
    return  null;
}

};
