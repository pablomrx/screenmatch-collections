package desafios.desafio01;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa01 = new Pessoa("João", 24);
        Pessoa pessoa02 = new Pessoa("Renato", 38);
        Pessoa pessoa03 = new Pessoa("Caroline", 23);

        listaDePessoas.add(pessoa01);
        listaDePessoas.add(pessoa02);
        listaDePessoas.add(pessoa03);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

        /*  for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println(listaDePessoas.get(i));
        }

        listaDePessoas.forEach(System.out::println);  */
    }
}