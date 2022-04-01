package br.inatel.cdg.Produtos;

public class Camiseta extends Produto{

    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho){
        super(nome,preco);
        this.tamanho = tamanho;
        this.cor =cor;
    }
    @Override
    public String etiquetaPreco(){

        String res = super.etiquetaPreco() + ", cor: "+cor+", tamanho: "+tamanho;

        return res;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
