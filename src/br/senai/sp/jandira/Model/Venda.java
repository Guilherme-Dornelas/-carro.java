package br.senai.sp.jandira.Model;

public class Venda {

public boolean realizarVenda(Cliente objCliente, Veiculo objVeiculo){



    System.out.println("----------------- validando venda-----------------------");

    if (objCliente.dinheiroDisponivel >= objVeiculo.valor){
        System.out.println("----------------- parabens-----------------------");
        System.out.println("ola" + objCliente.Nome);
        System.out.println("voce acaba de adiqurir" + objVeiculo.modelo + "amo: " + objVeiculo.ano);
        System.out.println("no valo de: " + objVeiculo.valor);
        System.out.println("----------------------------------------------------");

        return true;

    }else {
        System.out.println("escolha um carro mais barato!");
        return false;
    }

}

}
