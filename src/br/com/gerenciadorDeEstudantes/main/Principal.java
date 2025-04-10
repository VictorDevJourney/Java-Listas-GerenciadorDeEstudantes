package br.com.gerenciadorDeEstudantes.main;

import br.com.gerenciadorDeEstudantes.estrutura.Estudante;
import br.com.gerenciadorDeEstudantes.servico.GerenciadorEstudantes;

import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GerenciadorEstudantes gerenciador = new GerenciadorEstudantes();
        Scanner scanner = new Scanner(System.in);

        gerenciador.adicionarEstudante(new Estudante("Victor", 23, 9));
        gerenciador.adicionarEstudante(new Estudante("Eduardo", 20, 8.5));
        gerenciador.adicionarEstudante(new Estudante("Ana", 15, 9.4));
        gerenciador.adicionarEstudante(new Estudante("João", 17, 8));
        gerenciador.adicionarEstudante(new Estudante("Pamela", 22, 8.9));
        gerenciador.adicionarEstudante(new Estudante("Bruna", 16, 9 ));

        System.out.println("Lista de estudantes");
        gerenciador.listarEstudantes();

        System.out.println("Digite o nome do estudande que deseja encontrar");
        String nomeParaBuscar = scanner.nextLine();
        Estudante estudanteBuscado = gerenciador.buscarEstudante(nomeParaBuscar);
        if(estudanteBuscado != null){
            System.out.println("Estudante encontrado: " + estudanteBuscado.getNome() + " - " + estudanteBuscado.getIdade() + " anos - Nota: " + estudanteBuscado.getNota());
        }else {
            System.out.println("Estudante " + nomeParaBuscar + " não encontrado.");
        }

        System.out.println("Digite o nome do estudande que deseja remover da lista");
        String nomeParaRemover = scanner.nextLine();
        gerenciador.removerEstudante(nomeParaRemover);
        System.out.println("Estudante" + nomeParaRemover + " removido");

        System.out.println("Lista de estudantes após a remoção: ");
        gerenciador.listarEstudantes();

        System.out.println("Digite a idade para filtrar estudantes:");
        int idadeParaFiltrar = scanner.nextInt();
        List<Estudante> estudantesFiltrados = gerenciador.filtrarPorIdade(idadeParaFiltrar);
        System.out.println("Estudantes com mais de " + idadeParaFiltrar + " anos:");
        for (Estudante estudante : estudantesFiltrados) {
            System.out.println(estudante.getNome() + " - " + estudante.getIdade() + " anos - Nota: " + estudante.getNota());
        }

        scanner.close();
    }
}
