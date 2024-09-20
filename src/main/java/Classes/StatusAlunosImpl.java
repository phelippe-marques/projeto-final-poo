/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class StatusAlunosImpl extends StatusAlunos {
    private String tipo;
    private String condicao;
    
    public StatusAlunosImpl (String tipo, String condicao) {
        super(tipo, condicao);
    }
    
    @Override
    public void tipoAluno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void condicaoAluno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /*@Override
    public void tipoAluno(String tipo) {
         this.tipo = tipo;
    }

    @Override
    public void condicaoAluno(String condicao) {
         this.condicao = condicao;
    }*/    
    
    @Override
    public void mostrarMensagem() {
        System.out.println("Tipo de aluno: " + tipo);
        System.out.println("Condição do aluno: " + condicao);
    }
}
