package com.gilbertomorales.trabalhozamba;

/**
 * Construção do aluno/pessoa
 */

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int idade;

    /**
     * Construtor da classe Aluno.

     * @param nome Nome.
     * @param idade Idade
     */
    
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {

        return "\nNome: " + nome + " (" + idade + " anos)";

    }

    /**
     * Ordena por nome e idade.

     * @param outroAluno Outro aluno
     * @return Retorna um valor negativo, zero ou positivo conforme este aluno seja menor, igual ou maior que o outro.
     */
    
    @Override
    public int compareTo(Aluno outroAluno) {

        int nomeCompare = this.nome.compareTo(outroAluno.getNome());
        if (nomeCompare != 0) {
            return nomeCompare;
        } else {
            return Integer.compare(this.idade, outroAluno.getIdade());
        }

    }
}