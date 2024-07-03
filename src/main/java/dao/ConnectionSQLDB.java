/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author correia
 */
public class ConnectionSQLDB {
    static Connection connection;
    
    public static Connection catchConnection() throws ClassNotFoundException, SQLException{
        String server = "localhost:5432";
        String login = "postgres";
        String pass = "Joaope14";
        String nameDatabase = "mercearia";
        String url = "jdbc:postgresql://"+server+"/"+nameDatabase;
        
        
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, login, pass);
        
        return connection;
    }
}
