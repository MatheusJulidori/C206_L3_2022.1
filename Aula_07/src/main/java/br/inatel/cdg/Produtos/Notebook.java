package br.inatel.cdg.Produtos;

public class Notebook extends Produto{

    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome,double preco,double armazenamento,String gpu,String processador){
        super(nome,preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco(){

        String res = super.etiquetaPreco() + ", armazenamento: "+armazenamento
                +", gpu: "+gpu+", processador: "+processador;

        return res;
    }

    public void Ligar(){
        System.out.println("Notebook ligando");
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
