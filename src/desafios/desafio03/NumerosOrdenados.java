package desafios.desafio03;

import java.util.ArrayList;
import java.util.Collections;

public class NumerosOrdenados {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(12);
        numeros.add(23);
        numeros.add(7);
        numeros.add(2);
        numeros.add(9);

        Collections.sort(numeros);
        System.out.println("Lista de números ordenada: " + numeros);
    }
}