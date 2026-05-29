package desafios.desafio02;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto (perecível) [nome: " + getNome() + ", preço: " + getPreco() + ", quantidade: " + getQuantidade() + ", data de validade: " + dataValidade + "]";
    }
}