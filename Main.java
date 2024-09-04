package com.gilbertomorales.trabalhozamba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe principal para executar a ordenação de listas.
 */

public class Main {
    public static void main(String[] args) {

        // Listas
    	
        List<Aluno> listaParaBolha = new ArrayList<>();
        List<Aluno> listaParaSelecao = new ArrayList<>();
        List<Aluno> listaParaInsercao = new ArrayList<>();
        List<Aluno> listaParaSort = new ArrayList<>();

        int totalAlunos = 60000; // Total de alunos a serem gerados
        
        Random geradorAleatorio = new Random();
        int comprimentoNome = geradorAleatorio.nextInt(5, 6); // Comprimento do nome

        // Popular listas
        
        listaParaBolha = Util.popularLista(totalAlunos, comprimentoNome);
        listaParaSelecao = Util.popularLista(totalAlunos, comprimentoNome);
        listaParaInsercao = Util.popularLista(totalAlunos, comprimentoNome);
        listaParaSort = Util.popularLista(totalAlunos, comprimentoNome);

        // Ordenação
        
        Util.exibirOrdenacao(listaParaBolha, "bolha");
        Util.exibirOrdenacao(listaParaSelecao, "selecao");
        Util.exibirOrdenacao(listaParaInsercao, "insercao");
        Util.exibirOrdenacao(listaParaSort, "sort");
    }
}
