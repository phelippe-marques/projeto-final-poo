/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Classes.Alunos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author iasmi
 */
public class AlunosDAO {

    // Inserir um aluno no banco de dados
    public static void inserirAlunos(Alunos aluno) {
        String sql = "INSERT INTO alunos(nome, matricula) VALUES(?, ?)";

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, aluno.getNome());
            pstmt.setString(2, aluno.getMatricula());
            pstmt.executeUpdate();

            System.out.println("Aluno inserido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir aluno: " + e.getMessage());
        }
    }

    // Editar um aluno no banco de dados
    public static void editarAlunos(Alunos aluno) {
        String sql = "UPDATE alunos SET nome = ?, matricula = ? WHERE id = ?";

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, aluno.getNome());
            pstmt.setString(2, aluno.getMatricula());
            pstmt.setInt(3, aluno.getId());  // Certifique-se de ter o atributo ID no Aluno

            pstmt.executeUpdate();
            System.out.println("Aluno atualizado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }

    // Remover um aluno do banco de dados
    public static void removerAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Aluno removido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao remover aluno: " + e.getMessage());
        }
    }

    // Buscar todos os alunos no banco de dados
    public static List<Alunos> buscarTodosAlunos() {
        String sql = "SELECT * FROM alunos";
        List<Alunos> alunos = new ArrayList<>();

        try (Connection conn = ConexaoSQLite.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Itera pelos resultados e cria os objetos Aluno
            while (rs.next()) {
                Alunos aluno = new Alunos(
                    rs.getString("nome"),
                    rs.getString("matricula"),
                    new ArrayList<>() // Inicializando lista de cursos vazia, será preenchida depois se necessário
                );
                aluno.setId(rs.getInt("id"));  // Definir o ID do aluno
                alunos.add(aluno);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar alunos: " + e.getMessage());
        }

        return alunos;
    }

    // Buscar aluno por ID

    /**
     *
     * @param id
     * @return
     */
    public static Alunos buscarAlunoPorId(int id) {
        String sql = "SELECT * FROM alunos WHERE id = ?";
        Alunos aluno = null;

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                aluno = new Alunos(
                    rs.getString("nome"),
                    rs.getString("matricula"),
                    new ArrayList<>() // Inicializando lista de cursos vazia
                );
                aluno.setId(rs.getInt("id"));  // Definir o ID do aluno
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar aluno por ID: " + e.getMessage());
        }

        return aluno;
    }

    private static class ConexaoSQLite {

        private static Connection conectar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ConexaoSQLite() {
        }
    }

    private static class Alunos {

        public Alunos(String string, String string0, ArrayList<Object> arrayList) {
        }

        private void setId(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int getId() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getMatricula() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getNome() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


        
    }
}
