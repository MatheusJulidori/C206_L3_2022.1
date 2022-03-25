package br.inatel.cdg;

import br.inatel.cdg.Produtos.Camiseta;
import br.inatel.cdg.Produtos.Notebook;
import br.inatel.cdg.Produtos.Produto;

public class Main {

    public static void main(String[] args) {

        Camiseta c1 = new Camiseta("Hering",45,"Branca","G");
        Notebook n1 = new Notebook("Aspire 5",4500,250,"GeForce MXT250","Intel Core I7");

        Produto[] produtos = new Produto[2];

        produtos[0] = c1;
        produtos[1] = n1;

        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto.etiquetaPreco());
                if(produto instanceof Notebook){
                    Notebook n = (Notebook)produto;
                    n.Ligar();
                }
            }
        }
    }
}
