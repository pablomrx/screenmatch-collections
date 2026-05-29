package desafios.desafio02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto01 = new Produto("Sabão", 15.99, 5);
        Produto produto02 = new Produto("Detergente", 10.49, 8);
        Produto produto03 = new Produto("Amaciante", 18.90, 3);

        listaProdutos.add(produto01);
        listaProdutos.add(produto02);
        listaProdutos.add(produto03);
        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        ArrayList<ProdutoPerecivel> listaProdutoPerecivel = new ArrayList<>();

        ProdutoPerecivel produtoPerecivel01 = new ProdutoPerecivel("Leite", 8.99, 7, "24/06/2026");
        ProdutoPerecivel produtoPerecivel02 = new ProdutoPerecivel("Iogurte", 6.49, 12, "15/06/2026");
        ProdutoPerecivel produtoPerecivel03 = new ProdutoPerecivel("Queijo Mussarela", 24.90, 5, "10/07/2026");

        listaProdutoPerecivel.add(produtoPerecivel01);
        listaProdutoPerecivel.add(produtoPerecivel02);
        listaProdutoPerecivel.add(produtoPerecivel03);

        for (Produto produto : listaProdutoPerecivel) {
            System.out.println(produto);
        }
    }
}