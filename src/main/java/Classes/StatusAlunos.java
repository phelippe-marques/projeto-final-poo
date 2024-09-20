/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Admin
 */
public abstract class StatusAlunos implements SituacaoAluno{
    private String tipo;
    private String condicao;
    
    public StatusAlunos (String tipo, String condicao) {
        this.tipo = tipo;
        this.condicao = condicao;
    }
    
    public void tipoAluno(String tipo) {
        this.tipo = tipo;
    }

    public void condicaoAluno(String condicao) {
        this.condicao = condicao;
    }
    
   
    
    public abstract void mostrarMensagem();
}
