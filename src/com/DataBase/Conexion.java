package com.DataBase;

import java.sql.*;

public class Conexion {

    private final String user = "sql10625378";
    private final String pass = "tajGtRKkPM";
    private final String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10625378";

    public Connection getConexion() {
        Connection connect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No te pudiste conectar");
        }
        return connect;
    }
}
