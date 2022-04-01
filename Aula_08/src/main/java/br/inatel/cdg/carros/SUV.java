package br.inatel.cdg.carros;

public class SUV extends Carro{

    private String tracao;

    @Override
    public void taxa() {
        System.out.println("Esse carro tem uma taxa de 3% ao ano");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Ano: "+getAno());
        System.out.println("Cor: "+getCor());
        System.out.println("Valor "+getValor());
        System.out.println("Tração "+tracao);
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
}
