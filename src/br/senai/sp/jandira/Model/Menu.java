package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Funcionario objFucionario = new Funcionario();
    Venda objVenda = new Venda();
    Cliente cliente = new Cliente();

    Veiculo veiculo = new Veiculo();

    public void escolaCadastro(){

        boolean contimuar  = true;


        while (contimuar){



            System.out.println("--------------------------------------------");

            System.out.println("1 cadastrar cliente");
            System.out.println("2 cadastrar veiculo");
            System.out.println("3 cadastrar funcionario");
            System.out.println("4 realizar venda");
            System.out.println("5 listar veiculos");
            System.out.println("6 listar clientes");
            System.out.println("8 pesquisar veiculo ");
            System.out.println("9 sair do app");
            System.out.println("10 financiar veiculo");



            System.out.println("--------------------------------------------");
            int decisao = teclado.nextInt();
            teclado.nextLine();

            switch (decisao){
                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.CadastroClient();
                    cliente.adicionarCliente(objCliente);

                break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.Cadastrarveiculo();
                    veiculo.adicionarVeiculo(objVeiculo);
                    break;

                case 3:
                    Funcionario fucionario = new Funcionario();
                    objFucionario.CadastroFuncionario();
                    fucionario.adicionarFuncionario(objFucionario);
                    break;

                case 4:

                    cliente.listClientes();
                    System.out.println("informe qual cliente desej comprar o veiculo");
                    String clienteCompra = teclado.next();

                    veiculo.ListarVeiculos();
                    System.out.println("informe qual veiculo");
                    String veiculoSelecionado  = teclado.next();

                    objFucionario.listarFuncionario();
                    System.out.println("informe quem e o vendedor");
                    String vendedor = teclado.next();


                   Cliente objComprador =  cliente.pesquisarComprador(clienteCompra);

                   Veiculo objVeiculoVenda =  veiculo.pesquisarVeiculocompra(veiculoSelecionado);

                   Funcionario objVndedro = objFucionario.pesquisarVendedor(vendedor);

                   boolean FormadePagamnento  = objVenda.formadePagamneto();
                   boolean venda =  objVenda.realizarVenda(objComprador, objVeiculoVenda);
                    boolean vendaDireta = false;
                    boolean vendaFinanciada = false;

                   if (FormadePagamnento){
                       vendaDireta = objVenda.realizarVenda(objComprador, objVeiculoVenda);
                   }else {

                   }

                    if (vendaDireta || vendaFinanciada){
                        objComprador.dinheiroDisponivel -= objVeiculoVenda.valor;
                        System.out.println("Seu saldo é: " + objComprador.dinheiroDisponivel);

                        objVndedro.funcionarioBonus(objVeiculoVenda);

                        System.out.println("O Funcionario recebeu: " + objVndedro.bonus);

                    }
                   if (venda){
                       objComprador.dinheiroDisponivel -= veiculo.valor;
                       System.out.println("seu saldo e " + cliente.dinheiroDisponivel);
                       objFucionario.funcionarioBonus(veiculo);
                       System.out.println("O funcionário ficou com 10% do valor da venda. O percentual é: " + objFucionario.bonus);
                   }

                    break;

                case 5:
              veiculo.ListarVeiculos();

                    break;
                case 6:
                        cliente.listClientes();
                    break;

                case 7:
                      objFucionario.listarFuncionario();
                    break;

                case 8:

                    System.out.println("qual veiculo voçe esta caçando? ");
                    String veiculoPesquisado = teclado.next();
                    veiculo.pesquisarVeiculo(veiculoPesquisado);
                    boolean validaVeiculo = false;

                    if (veiculoPesquisado != null){
                     validaVeiculo = veiculo.pesquisarVeiculo(veiculoPesquisado);
                    }else {
                        System.out.println("impossivel realizar pesquisa");
                    }

                    if (validaVeiculo){
                        System.out.println("veiculo disponivel para compra");
                    } else {
                        System.out.println("infelismente nao temos este veiculo");
                    }
                    break;

                case 9:
                    contimuar = false;
                    break;
            }

            if (decisao < 0 || decisao > 8){
                System.out.println("digite uma opcao valida");
            }
        }

    }
}
