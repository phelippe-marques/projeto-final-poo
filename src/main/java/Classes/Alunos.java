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
public class Alunos {

    private String nome;
    private String matricula;
    private List<String> cursos;  // Lista de cursos nos quais o aluno está matriculado

    // Construtor
    public Alunos(String nome, String matricula, List<String> cursos) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = cursos;
    }

    /* sobrecarga
    public Alunos() {
        System.otut.println("Sem alunos matriculados");
    }
    public Alunos(String nome, double matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    */
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    // Método para adicionar um curso
    public void adicionarCurso(String curso) {
        this.cursos.add(curso);
    }

    // Método para remover um curso
    public void removerCurso(String curso) {
        this.cursos.remove(curso);
    }

    // Método para retornar os dados do aluno como uma string
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matrícula='" + matricula + '\'' +
                ", cursos=" + cursos +
                '}';
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
