package com.gilbertomorales.trabalhozamba;

import java.util.List;

/**
 * Classe para os métodos de ordenação
 */

public class Ordenacao {

    /**
     * Ordenada por bolha.
     *
     * @param lista Lista a ser ordenada.
     */
	
    public static void ordenarPorBolha(List<Aluno> lista) {
        boolean foiTrocado;
        do {
            foiTrocado = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).compareTo(lista.get(i + 1)) > 0) {
                    Aluno temporario = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, temporario);
                    foiTrocado = true;
                }
            }
        } while (foiTrocado);
    }

    /**
     * Ordenada por seleção.
     *
     * @param lista Lista a ser ordenada.
     */
    
    public static void ordenarPorSelecao(List<Aluno> lista) {
        int tamanhoLista = lista.size();
        for (int i = 0; i < tamanhoLista - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < tamanhoLista; j++) {
                if (lista.get(j).compareTo(lista.get(menorIndice)) < 0) {
                    menorIndice = j;
                }
            }
            if (menorIndice != i) {
                Aluno temporario = lista.get(menorIndice);
                lista.set(menorIndice, lista.get(i));
                lista.set(i, temporario);
            }
        }
    }

    /**
     * Ordenada por inserção.
     *
     * @param lista Lista a ser ordenada.
     */
    
    public static void ordenarPorInsercao(List<Aluno> lista) {
        for (int i = 1; i < lista.size(); i++) {
            Aluno atual = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j).compareTo(atual) > 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, atual);
        }
    }
}
