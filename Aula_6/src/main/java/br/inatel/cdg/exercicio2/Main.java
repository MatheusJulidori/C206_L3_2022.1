package br.inatel.cdg.exercicio2;

import br.inatel.cdg.exercicio2.Banco.Cliente;
import br.inatel.cdg.exercicio2.Banco.Conta;

public class Main {

    public static void main(String[] args) {

        //Criando conta
        Conta c1 = new Conta();

        c1.getCliente().setCpf("1234567890");//Retorna o objeto com o getCliente() e acessa o CPF usando o setCPF();
        c1.getCliente().setNome("Matheus");//Retorna o objeto do cliente e acessa o Nome usando o setter

        System.out.println("Nome do cliente: "+c1.getCliente().getNome());//Retorna o objeto com o getCliente() e retorna o nome do cliente com o getNome()
        System.out.println("Nome do CPF: "+c1.getCliente().getCpf());//Retorna o objeto com do cliente e retorna o cpf

        Cliente cl1 = new Cliente();//Cria um novo cliente na main

        cl1.setNome("Matheus Julidori");//Seta o nome desse novo cliente
        cl1.setCpf("987654321");//Seta o cpf desse novo cliente

        c1.setCliente(cl1);//Seta o cliente da conta c1 como esse cliente

        //Exibe as informações do novo cliente
        System.out.println("Nome do cliente: "+c1.getCliente().getNome());
        System.out.println("Nome do CPF: "+c1.getCliente().getCpf());

        //Mostra o extrado e tenta realizar operações
        c1.extrato();
        c1.depositar(-100);
        c1.depositar(300);
        c1.extrato();
        c1.sacar(400);
        c1.sacar(-100);
        c1.sacar(200);
        c1.extrato();

        //Mostra a quantidade de clientes com Conta que o banco tem
        System.out.println(Conta.getQtdCliente());

    }

}
