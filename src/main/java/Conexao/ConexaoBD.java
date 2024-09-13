/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iasmi
 */
public class ConexaoBD {

    //corrigi DATAPH para DATAPATH
    //
    private static final String DATAPATH = "jdbc:sqlite:";

    public static Connection getConnection() {

        try {

            //coloquei o return para retornar o driver manager
            return DriverManager.getConnection(DATAPATH);

        } catch (SQLException ex) {
            System.out.println("Falha ao conectar com o banco!!");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }

    public static void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {

            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static class Conexao {

        public Conexao() {
        }
    }
}
