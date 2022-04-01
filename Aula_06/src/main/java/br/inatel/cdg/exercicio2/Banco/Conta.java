package br.inatel.cdg.exercicio2.Banco;

public class Conta {

    private static int qtdClientes;
    private double saldo;
    private Cliente cliente;

    public Conta(){
        saldo = 0;
        qtdClientes++;
        cliente = new Cliente();
    }

    public void depositar(double valor){
        if(valor<0) System.out.println("Valor inválido");
        else saldo+=valor;
    }

    public void sacar(double valor){
        if(valor<0){
            System.out.println("Valor inválido");
        }else if(saldo>valor){
            saldo-=valor;
        }else{
            System.out.println("Você não tem saldo suficiente");
        }
    }

    public void extrato(){
        System.out.println("Saldo: "+saldo);
    }

    public static int getQtdCliente() {
        return qtdClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
