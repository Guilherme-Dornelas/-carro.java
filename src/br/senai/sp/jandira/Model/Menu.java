package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    Cliente objCliente = new Cliente();
    Veiculo objVeiculo = new Veiculo();
    Funcionario objFucionario = new Funcionario();
    Venda objVenda = new Venda();

    public void escolaCadastro(){

        boolean contimuar  = true;


        while (contimuar){
            System.out.println("--------------------------------------------");

            System.out.println("1 cadastrar cliente");
            System.out.println("2 cadastrar veiculo");
            System.out.println("3 cadastrar funcionario");
            System.out.println("4 realizar venda");
            System.out.println("5 sair do app");

            System.out.println("--------------------------------------------");
            int decisao = teclado.nextInt();
            teclado.nextLine();

            switch (decisao){
                case 1:
                    objCliente.CadastroClient();
                break;

                case 2:
                    objVeiculo.Cadastrarveiculo();
                    break;

                case 3:

                    objFucionario.CadastroFuncionario();
                    break;

                case 4:
                   boolean venda =  objVenda.realizarVenda(objCliente, objVeiculo);
                   if (venda){
                       objCliente.dinheiroDisponivel -= objVeiculo.valor;
                       System.out.println("seu saldo e " + objCliente.dinheiroDisponivel);
                   }

                    objFucionario.funcionarioBonus(objVeiculo);

                    System.out.println("O funcionário ficou com 10% do valor da venda. O percentual é: " + objFucionario.bonus);

                    break;

                case 5:
                    contimuar = false;
                    break;
            }

            if (decisao < 0 || decisao > 5){
                System.out.println("digite uma opcao valida");
            }
        }


        }


}
