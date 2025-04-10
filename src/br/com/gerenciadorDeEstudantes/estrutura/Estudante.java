package br.com.gerenciadorDeEstudantes.estrutura;

public class Estudante implements Comparable<Estudante> {
    private String nome;
    private int idade;
    private double nota;

    public Estudante(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Estudante outro) {
        return Double.compare(outro.getNota(), this.getNota());
    }
}
