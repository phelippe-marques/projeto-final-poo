/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.List;

/**
 *
 * @author iasmi
 */
public class Cursos {

    private String nome;
    private String codigo;
    private List<String> professores;  // Lista de professores que lecionam no curso

    // Construtor
    public Cursos(String nome, String codigo, List<String> professores) {
        this.nome = nome;
        this.codigo = codigo;
        this.professores = professores;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<String> getProfessores() {
        return professores;
    }

    public void setProfessores(List<String> professores) {
        this.professores = professores;
    }

    // Método para adicionar um professor ao curso
    public void adicionarProfessor(String professor) {
        this.professores.add(professor);
    }

    // Método para remover um professor do curso
    public void removerProfessor(String professor) {
        this.professores.remove(professor);
    }

    // Método para retornar os dados do curso como uma string
    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", código='" + codigo + '\'' +
                ", professores=" + professores +
                '}';
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
