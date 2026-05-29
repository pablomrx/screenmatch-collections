package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        // Filme 1
        Filme filme01 = new Filme("Guardiões da Galáxia", 2014, true, 121);
        filme01.avalia(9);

        Filme f1 = filme01; // referência

        // Filme 2
        Filme filme02 = new Filme("O poderoso chefão", 1972, false, 175);
        filme02.avalia(7.8);

        // Filme 3
        Filme filme03 = new Filme("Dogville", 2003, true, 178);
        filme03.avalia(8.3);

        // Serie 1
        Serie serie01 = new Serie("Lost", 2004, true);

        // Lista
        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme01);
        lista.add(filme02);
        lista.add(filme03);
        lista.add(serie01);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}