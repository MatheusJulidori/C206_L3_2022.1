package br.inatel.cdg;

import br.inatel.cdg.sistemaDeCompras.Carrinho;
import br.inatel.cdg.sistemaDeCompras.Produto;

public class Main {

    public static void main(String[] args) {

        Carrinho c = new Carrinho();
        c.addProduto(new Produto("Playstation",4000));
        c.addProduto(new Produto("Computador",5500));
        c.addProduto(new Produto("Carro",45000));
        c.addProduto(new Produto("Sapato",350));

        c.mostrarProdutos();
        System.out.println("-------------------------");
        c.sort(1);
        c.mostrarProdutos();
        System.out.println("-------------------------");
        c.sort(-1);
        c.mostrarProdutos();

    }

}
