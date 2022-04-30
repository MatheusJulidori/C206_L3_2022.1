package br.inatel.cdg;

import br.inatel.cdg.sistemaDeCompras.Carrinho;
import br.inatel.cdg.sistemaDeCompras.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Carrinho c = new Carrinho();

        int index;
        Scanner sc = new Scanner(System.in);
        List<Produto> listaDeProdutos = new ArrayList<>();
        boolean flag = true;

        listaDeProdutos.add(new Produto("Playstation",4000));
        listaDeProdutos.add(new Produto("Computador",5500));
        listaDeProdutos.add(new Produto("Carro",45000));
        listaDeProdutos.add(new Produto("Sapato",350));

        while(flag) {
            System.out.println("Menu");
            System.out.println("Entre com a opção desejada: ");
            System.out.println("1 - Adicionar produto no carrinho");
            System.out.println("2 - Ver lista de produtos");
            System.out.println("3 - Sair");
            index = sc.nextInt();
            switch (index) {
                case 1:
                    System.out.println("Qual produto deseja adicionar?");
                    int produto = sc.nextInt();
                    c.addProduto(listaDeProdutos.get(produto - 1));
                    break;
                case 2:
                    int count = 1;
                    for (Produto p:listaDeProdutos){
                        System.out.println(count+"-"+p.getNome());
                        count++;
                    }
                    break;

                case 3:
                    System.out.println("Obrigado!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

        System.out.println("-----------Antes de ordenar--------------");
        c.mostrarProdutos();
        System.out.println("----------Ordenado crescente-------------");
        c.sort(1);
        c.mostrarProdutos();
        System.out.println("----------Ordenado descrescente----------");
        c.sort(-1);
        c.mostrarProdutos();

    }

}
