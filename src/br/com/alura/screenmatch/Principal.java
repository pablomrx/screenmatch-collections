package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // FILME 1
        Filme filme01 = new Filme();

        filme01.setNome("Guardiões da Galáxia");
        filme01.setAnoDeLancamento(2014);
        filme01.setIncluidoNoPlano(true);
        filme01.setDuracaoEmMinutos(121);

        filme01.avalia(8);
        filme01.avalia(9);
        filme01.avalia(10);

        filme01.exibeFichaTecnica();
        System.out.println("esse é o total de avaliações: " + filme01.getTotalDeAvaliacoes());

        // Filme 2
        Filme filme02 = new Filme();

        filme02.setNome("O poderoso Chefão");
        filme02.setAnoDeLancamento(1972);
        filme02.setIncluidoNoPlano(false);
        filme02.setDuracaoEmMinutos(175);

        filme02.avalia(8);
        filme02.avalia(5);
        filme02.avalia(10);

        filme02.exibeFichaTecnica();

        // Serie 1
        Serie serie01 = new Serie();
        serie01.setNome("Lost");
        serie01.setAnoDeLancamento(2004);
        serie01.setIncluidoNoPlano(true);

        serie01.avalia(7.4);
        serie01.avalia(2.9);
        serie01.avalia(6.8);
        serie01.obterMedia();

        serie01.setTemporadas(6);
        serie01.setEpisodiosPorTemporada(20);
        serie01.setMinutosPorEpisodio(43);

        serie01.exibeFichaTecnica();

        // calcular tempo de titulos
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme01);
        calculadora.inclui(filme02);
        calculadora.inclui(serie01);
        System.out.println("\nTempo para maratonar titulos: " + calculadora.getTempoTotal() + "\n");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println("O filme: " + filme01.getNome());
        filtro.filtra(filme01);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie01);
        episodio.setTotalVisualizacoes(300);
        System.out.println("A série: " + serie01.getNome());
        filtro.filtra(episodio);

        leitura.close();
    }
}