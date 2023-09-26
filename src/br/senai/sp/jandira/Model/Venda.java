package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Venda {


    String formadePgaamento;
    Scanner teclado = new Scanner(System.in);

    public boolean realizarVenda(Cliente objCliente, Veiculo objVeiculo) {

        System.out.println("------ Validando Venda -------");

        if (objCliente.dinheiroDisponivel >= objVeiculo.valor) {

            System.out.println("------------------- Parabéns  --------------------");
            System.out.println("Olá " + objCliente.Nome);
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No precinho de " + objVeiculo.valor);
            System.out.println("--------------------------------------------------");

            return true;

        } else {
            System.out.println("Escolha um carro mais acessivel");
            return false;
        }
      }

      public boolean formadePagamneto(){

          System.out.println("------------------- forma de pagamento  --------------------");
          System.out.println("1 a vista");
          System.out.println("2 finaciado");
          System.out.println("--------------------------------------------------");

          int option = teclado.nextInt();

        if (option == 1 ){
            return true;
        }

        return false;

      }

      public boolean finacIarVeiculo(Cliente objCliente, Veiculo objVeiculo){

          System.out.println("--------------------finaciamento-----------------------");
          System.out.println("informe o valor de entrada");
          double valorEntrada = teclado.nextDouble();

          if (valorEntrada <= objCliente.dinheiroDisponivel && valorEntrada > 0){
              double valorFinaciado = objVeiculo.valor - valorEntrada;

              System.out.println("O financiamento ficou em " + valorFinaciado + "Dolares");
              System.out.println("informe em qunatas vezes deseja parcelar: ");
              int parcelas = teclado.nextInt();
              teclado.nextLine();

              double valorPacela = valorFinaciado/parcelas;

              System.out.println("a parcela ficou em " + valorPacela + "Dolares");
              return true;
          }
          return false;
      }
     }

// tenho que re fazer o sistema de venda, pois o mesmo nao esta mais atendendo as demanda do novo codigo!
// 1 ve ser o cliente tem mais dinheiro que valor do carro.
// 2 ver se o carro esta cadastrado

// problema!
// o codigo falhou, nao printou as informaçoes, e a validaçao nao funcinou
