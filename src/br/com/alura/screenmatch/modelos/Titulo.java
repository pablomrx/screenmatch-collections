package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("\n----- Ficha Técnica -----");
        System.out.println("Nome " + getTipo() + ": " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano: " + (incluidoNoPlano ? "Sim" : "Não"));
        System.out.printf("Média das avaliações: %.2f\n", obterMedia());
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
    }

    public String getTipo() {
        return "título";
    }

    public void avalia(double nota) {
        if (nota >= 0 && nota <= 10) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public double obterMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}