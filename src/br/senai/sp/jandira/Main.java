package br.senai.sp.jandira;

import br.senai.sp.jandira.Model.Cliente;
import br.senai.sp.jandira.Model.Menu;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------bem vindo!----------------- ");
        System.out.println("/-/--/-/-/-/-/--/agencia multimarcas/-/-/-/-/-/-/-/-/--/-");
        System.out.println("-------------------iniciar cadastro!--------------- ");

        Menu objMneu = new Menu();
        objMneu.escolaCdastro();
    }
}
