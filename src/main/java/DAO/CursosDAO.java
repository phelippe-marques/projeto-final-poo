/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Classes.Cursos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iasmi
 */
public class CursosDAO {

    // Inserir um curso no banco de dados
    public static void inserirCursos(Cursos curso) {
        String sql = "INSERT INTO cursos(nome, codigo) VALUES(?, ?)";

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, curso.getNome());
            pstmt.setString(2, curso.getCodigo());
            pstmt.executeUpdate();

            System.out.println("Curso inserido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir curso: " + e.getMessage());
        }
    }

    // Editar um curso no banco de dados
    public static void editarCursos(Cursos curso) {
        String sql = "UPDATE cursos SET nome = ?, codigo = ? WHERE id = ?";

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, curso.getNome());
            pstmt.setString(2, curso.getCodigo());
            pstmt.setInt(3, curso.getId());  // Certifique-se de ter o atributo ID no Curso

            pstmt.executeUpdate();
            System.out.println("Curso atualizado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar curso: " + e.getMessage());
        }
    }

    // Remover um curso do banco de dados
    public static void removerCurso(int id) {
        String sql = "DELETE FROM cursos WHERE id = ?";

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Curso removido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao remover curso: " + e.getMessage());
        }
    }

    // Buscar todos os cursos no banco de dados
    public static List<Cursos> buscarTodosCursos() {
        String sql = "SELECT * FROM cursos";
        List<Cursos> cursos = new ArrayList<>();

        try (Connection conn = ConexaoSQLite.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Itera pelos resultados e cria os objetos Curso
            while (rs.next()) {
                Cursos curso = new Cursos(
                    rs.getString("nome"),
                    rs.getString("codigo"),
                    new ArrayList<>() // Inicializando lista de professores vazia, será preenchida depois se necessário
                );
                cursos.add(curso);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar cursos: " + e.getMessage());
        }

        return cursos;
    }

    // Buscar curso por ID
    public static Cursos buscarCursoPorId(int id) {
        String sql = "SELECT * FROM cursos WHERE id = ?";
        Cursos curso = null;

        try (Connection conn = ConexaoSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                curso = new Cursos(
                    rs.getString("nome"),
                    rs.getString("codigo"),
                    new ArrayList<>() // Inicializando lista de professores vazia
                );
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar curso por ID: " + e.getMessage());
        }

        return curso;
    }

    private static class ConexaoSQLite {

        private static Connection conectar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public ConexaoSQLite() {
        }
    }
}
