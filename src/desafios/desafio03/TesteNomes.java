package desafios.desafio03;

import java.util.ArrayList;
import java.util.Collections;

public class TesteNomes {
    public static void main(String[] args) {
        ArrayList<Nomes> listaNomes = new ArrayList<>();

        listaNomes.add(new Nomes("Leticia"));
        listaNomes.add(new Nomes("Higor"));
        listaNomes.add(new Nomes("Mateus"));
        listaNomes.add(new Nomes("Anderson"));
        listaNomes.add(new Nomes("Rodrigo"));

        Collections.sort(listaNomes);
        for (Nomes nome : listaNomes) {
            System.out.println(nome);
        }
    }
}