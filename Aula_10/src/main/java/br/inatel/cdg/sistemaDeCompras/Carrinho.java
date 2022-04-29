package br.inatel.cdg.sistemaDeCompras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto p){
        produtos.add(p);
    }

    public void mostrarProdutos(){
        produtos.forEach(produto -> {
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
        });

        /*
        for(Produto p: produtos){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }
        */

        /*
        for(int i = 0;i<produtos.size();i++){
            System.out.println(produtos.get(i).getNome());
            System.out.println(produtos.get(i).getPreco());
        }
        */

    }

    public void sort(int order){
        //Ordena para 1 = crescente e -1 = decrescente
        if(order == 1)
            Collections.sort(produtos);
        else if(order == -1)
            Collections.reverse(produtos);
        else{
            System.out.println("Inválido");
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
