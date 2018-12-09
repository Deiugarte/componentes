/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Luis
 */
public class BotService {

    // JDBC driver name and database URL
    private String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://168.235.81.213:3306/componentes";
    //  Database credentials
    private String USER = "componentes";
    private String PASS = "componentes";
    private Connection conn = null;
    private Statement stmt = null;
    
       /* public void conectar() {

        try {
            //STEP 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //STEP 2: Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se puedo registrar el driver...");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("No se puede conectar...");
        }
    }*/

    public List<Bot> listAllBots() {
        String SQL = "SELECT * FROM listabot;";
        List<Bot> bots = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement prepStmt = conn.prepareStatement(SQL);
                ResultSet rs = prepStmt.executeQuery()) {

            while (rs.next()) {
                Bot bot = new Bot();
                bot.setIdBot(rs.getString("idBot"));
                bot.setNombreBot(rs.getString("nombreBot"));
                bot.setDescripcionBot(rs.getString("descripcion"));
                bot.setLinkBot(rs.getString("linkbot"));
                bots.add(bot);
            }
            return bots;

        } catch (Exception ex) {
            System.out.println("No se pudieron cargar las preguntas.");
            ex.printStackTrace();
        }
        return null;
    }

    public boolean addBot(Bot bot) {
        String SQL = "INSERT INTO listabot (nombreBot,descripcion,linkBot) "
                + "VALUES (?, ?, ?);";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement prepStmt = conn.prepareStatement(SQL)) {

            prepStmt.setString(1, bot.getNombreBot());
            prepStmt.setString(2, bot.getDescripcionBot());
            prepStmt.setString(3, bot.getLinkBot());
            prepStmt.executeUpdate();
            return true;

        } catch (SQLIntegrityConstraintViolationException ex) {
            ex.printStackTrace();
            return false;
        } catch (Exception e) {
            System.out.println("No pudo insertar la pregunta.");
            e.printStackTrace();
        }
        return false;
    }
}