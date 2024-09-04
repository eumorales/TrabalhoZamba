package com.gilbertomorales.trabalhozamba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Classe utilitária para popular as listas
 */

public class Util {

    /**
     * Gera "nomes" aleatórios

     * @param tamanho (int) Tamanho do nome.
     * @return: Nome aleatório
     */
	
    public static String gerarNomeAleatorio(int tamanho) {

        String letras = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder nome = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            char letraSorteada = letras.charAt(random.nextInt(letras.length()));
            nome.append(letraSorteada);
        }

        return nome.toString();
    }


    /**
     * Gera idades aleatórias entre 18 e 70.
     *
     * @return Idade aleatória
     */
    
    public static int gerarIdadeAleatoria() {

        Random random = new Random();
        return random.nextInt(18,70);

    }

    /**
     * Exibe uma lista ordenada.
     *
     * @param lista (list) A lista de alunos a ser exibida.
     * @param metodo (str) O método de ordenação a ser aplicado.
     */
    
    public static void exibirOrdenacao(List<Aluno> lista, String metodo) {

        switch (metodo) {
            case "bolha":
                Ordenacao.ordenarPorBolha(lista);
                break;
            case "selecao":
                Ordenacao.ordenarPorSelecao(lista);
                break;
            case "insercao":
                Ordenacao.ordenarPorInsercao(lista);
                break;
            case "sort":
                Collections.sort(lista);
                break;
            default:
                throw new IllegalArgumentException("Método inválido: " + metodo);
        }

        System.out.println("\nLista (" + metodo + "):");
        System.out.println(lista);
    }


    /**
     * Popula uma lista com nomes e idades.
     *
     * @param quantidade Quantidade a ser gerada
     * @param tamanho Nome Tamanho dos nomes
     * @return Lista populada
     */
    
    public static List<Aluno> popularLista(int quantidade, int tamanhoNome) {

        List<Aluno> lista = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            String nome = gerarNomeAleatorio(tamanhoNome);
            int idade = gerarIdadeAleatoria();
            lista.add(new Aluno(nome, idade));
        }

        return lista;
    }
}