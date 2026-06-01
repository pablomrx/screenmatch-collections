package desafios.desafio03;

public class Nomes implements Comparable<Nomes> {
    private String nome;

    public Nomes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Nomes outroNome) {
        return this.nome.compareTo(outroNome.nome);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
}