package com.DataBase;

import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JLabel;

/**
 *
 * @author marlo
 */
public class Sentencias {
    
    private final String[] BD = {"ADMINISTRADORES", "USUARIOS", "PASSWD", "STATE", "INTENTOS"};
    private final Conexion con = new Conexion();
    
    public String comprobarUsuarioYBloqueo(JTextField usuario) {
        try {
            ResultSet rs = this.query(usuario.getText());
            if (rs.next()) {
                return rs.getString(this.BD[3]);
            }
            return "vacio";
        } catch (SQLException ex) {
            System.out.println(ex);
            return "vacio";
        }
    }
    
    public boolean iniciarSesion(String contraseña, String usuario, JLabel errorUsuario) {
        try {
            ResultSet rs = this.query(usuario);
            if (rs.next()) {
                String contraBD = rs.getString(this.BD[2]);
                if (contraseña.equals(contraBD)) {
                    this.limpiarIntentos(usuario);
                    return true;
                } else {
                    this.setIntento(usuario);
                    this.comprobarIntentos(usuario, errorUsuario);
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
            return false;
        }
    }
    
    private ResultSet query(String usuario) throws SQLException {
        Connection cn = this.con.getConexion();
        String sql = "SELECT * FROM " + this.BD[0] + " WHERE " + this.BD[1] + " = ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, usuario);
        return ps.executeQuery();
    }
    
    private void setIntento(String usuario) {
        try {
            Connection cn = this.con.getConexion();
            String sql = "UPDATE " + this.BD[0] + " SET " + this.BD[4] + " = " + this.BD[4] + " + " + 1 + " WHERE " + this.BD[1] + " = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error setIntento" + ex);
        }
    }
    
    private void limpiarIntentos(String usuario) {
        try {
            Connection cn = this.con.getConexion();
            String sql = "UPDATE " + this.BD[0] + " SET " + this.BD[4] + " = 0 WHERE " + this.BD[1] + " = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }
    
    private void comprobarIntentos(String usuario, JLabel errorUsuario) {
        try {
            ResultSet rs = this.query(usuario);
            if (rs.next()) {
                int intentos = rs.getInt(this.BD[4]);
                if (intentos == 3) {
                    this.bloquearUsuario(usuario,errorUsuario);
                }
            }
        } catch (SQLException ex) {
        }
    }
    
    private void bloquearUsuario(String usuario, JLabel errorUsuario) {
        try {
            Connection cn = this.con.getConexion();
            String sql = "UPDATE " + this.BD[0] + " SET " + this.BD[3] + " = ? WHERE " + this.BD[1] + " = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, "NO");
            ps.setString(2, usuario);
            ps.executeUpdate();
            errorUsuario.setText("Usuario bloqueado");
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }
}
