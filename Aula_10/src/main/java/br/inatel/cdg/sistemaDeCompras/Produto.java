package br.inatel.cdg.sistemaDeCompras;

public class Produto implements Comparable<Produto>{

    private String nome;
    private double preco;



    @Override
    public int compareTo(Produto produto) {
        return Double.compare(this.preco,produto.preco);
    }


    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
