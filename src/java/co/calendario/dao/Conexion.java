/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calendario.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela Calderón Vela
 */
public class Conexion {
    public Connection conectarse(){
        String url= "jdbc:postgresql://127.0.0.1:5432/basemaestra";//consultaproyecto
        String usuario = "postgres";
        String clave = "postgres";
        try{
            Class.forName("org.postgresql.Driver");
            Connection cx = DriverManager.getConnection(url, usuario, clave);
            return cx;
    }catch(ClassNotFoundException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "El Driver de Postgres no existe", ex);
    }catch(SQLException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "El usuario o la clave incorrecta", ex);
    }
    return null;
}
    public void desconexion(Connection conx){//Connection
        if(conx != null){
            try{
                conx.close();
            }catch(SQLException ex){
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error de desconexion de la base de datos", ex);
            }
        }
        
    }
    
    public static void main(String[] args){
        Conexion con = new Conexion();
        Connection cx = con.conectarse();
        System.out.println("Conecto rta"+cx);
    }
}