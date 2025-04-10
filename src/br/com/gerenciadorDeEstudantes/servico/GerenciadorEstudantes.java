package br.com.gerenciadorDeEstudantes.servico;

import br.com.gerenciadorDeEstudantes.estrutura.Estudante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorEstudantes {
        ArrayList<Estudante> listaEstudantes = new ArrayList<>();

        public void adicionarEstudante(Estudante estudante){
            listaEstudantes.add(estudante);
        }

        public void removerEstudante(String nome){
            for(Estudante estudante : listaEstudantes){
                if (estudante.getNome().equals(nome)){
                    listaEstudantes.remove(estudante);
                    break;
                }
            }
        }

        public void listarEstudantes(){
            Collections.sort(listaEstudantes);
            for (Estudante estudante : listaEstudantes){
                System.out.println(estudante.getNome() + " - " + estudante.getIdade() + " anos - Nota: " + estudante.getNota());
            }
        }

        public Estudante buscarEstudante(String nome){
            for(Estudante estudante : listaEstudantes) {
                if (estudante.getNome().equals(nome)) {
                    return estudante;
                }
            }
            return null;
        }

        public List<Estudante> filtrarPorIdade(int idade){
            List<Estudante> filtroDeIdade = new ArrayList<>();
            for (Estudante estudante : listaEstudantes){
                if(estudante.getIdade() > idade){
                    filtroDeIdade.add(estudante);
                }
            }
            return filtroDeIdade;
        }

}
