/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calendario.dao;

import co.calendario.dto.Proyecto;
import co.calendario.dto.Evaluador;
import co.calendario.dto.Espacios;
import co.calendario.dto.Calendario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.calendario.interfaces.OperacionCalendario;

/**
 *
 * @author Daniela Calderón Vela
 */
public class OperCalendarioTM implements OperacionCalendario{
    public int registrarespacios(Espacios dato){
        Conexion con = new Conexion();
        Connection cx = con.conectarse();
        if(cx != null){
            try{
                PreparedStatement ps = cx.prepareStatement("INSERT INTO registroespacios(nombre, practica, direccion, capacidad)" 
                            +"VALUES (?, ?, ?, ?)");
                ps.setString(1, dato.getNombre());
                ps.setInt(2, dato.getPractica());
                ps.setString(3, dato.getDireccion());
                ps.setInt(4, dato.getCapacidad());
                
                int rta = ps.executeUpdate();
                return rta;
                
            }catch(SQLException ex){
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al insertar el espacio fisico de exposicion", ex);
            }finally{
                con.desconexion(cx);
            }
        }
        return 0;
    }
    
    public List<Proyecto> consultarproyectos(String pk){
        return null;
    }
    
    public List<Proyecto> consultarproyectos(){
    Conexion con = new Conexion();
        Connection cx = con.conectarse();
        List<Proyecto> datos = new ArrayList<Proyecto>();
         if(cx != null){
            try{
                PreparedStatement ps = cx.prepareStatement("SELECT * FROM consultaproyectos");
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String nombreproyecto = rs.getString("nombre");
                    int numeropractica = rs.getInt("practica");
                    String estudiante1 = rs.getString("estudiante1");
                    String estudiante2 = rs.getString("estudiante2");
                    String estudiante3 = rs.getString("estudiante3");
                    
                    Proyecto p = new Proyecto();
                    p.setNombre(nombreproyecto);
                    p.setPractica(numeropractica);
                    p.setEstudiante1(estudiante1);
                    p.setEstudiante2(estudiante2);
                    p.setEstudiante3(estudiante3);
                    
                    datos.add(p);
                }
                return datos;
                
            }catch(SQLException ex){
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al consultar los proyectos", ex);
            }finally{
                con.desconexion(cx);
            }
        }
        return datos;    
    }
    
    public List<Evaluador> consultarevaluadores(String dato){
        return null;
    }
    
    public List<Evaluador> consultarevaluadores(){
        Conexion con = new Conexion();
        Connection cx = con.conectarse();
        List<Evaluador> datos = new ArrayList<Evaluador>();
         if(cx != null){
            try{
                PreparedStatement ps = cx.prepareStatement("SELECT * FROM consultaevaluadores");
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int identificacion = rs.getInt("identificacion");
                    String nombre = rs.getString("nombre");
                    String apellidos = rs.getString("apellidos");
                    String telefono = rs.getString("telefono");
                    String correo = rs.getString("correo");
                    
                    Evaluador e = new Evaluador();
                    e.setIdentificacion(identificacion);
                    e.setNombre(nombre);
                    e.setApellidos(apellidos);
                    e.setTelefono(telefono);
                    e.setCorreo(correo);
                    
                    datos.add(e);
                }
                return datos;
                
            }catch(SQLException ex){
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al consultar los proyectos", ex);
            }finally{
                con.desconexion(cx);
            }
        }
        return datos;    
    }   
    /*
    public int registrarFecha(Calendario dato){
        Conexion con = new Conexion();
        Connection cx = con.conectarse();
        if(cx != null){
            try{
                PreparedStatement ps = cx.prepareStatement("INSERT INTO registrofecha(fecha, hora, direccion)" 
                            +"VALUES (?, ?, ?, ?)");
                ps.setDate(1, dato.getFecha());
                ps.setDate(2, dato.getHora());
                
                int rta = ps.executeUpdate();
                return rta;
                
            }catch(SQLException ex){
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al insertar la fecha y hora de presentacion de proyectos", ex);
            }finally{
                con.desconexion(cx);
            }
        }
        return 0;
    }
    */
    public static void main(String[] args){
        OperCalendarioTM oper = new OperCalendarioTM();
        
        /*DatosEspacios de = new DatosEspacios();
        de.setNombreespacio("Tunel de ingenieria");
        de.setDireccionespacio("Calle 40#41-48");
        de.setCapacidadespacio(11);
        
        int x = oper.registrarespacios(de);
        System.out.println("rta"+x);*/
        
       /* 
       Proyecto p = new Proyecto();
       List<Proyecto> lista = oper.consultarproyectos();
        System.out.println("Lista: "+lista); 
        if(lista.size() >0){
            System.out.println("Hay datos");
            for(Proyecto proyecto : lista){
                System.out.println("Datos de proyectos de: "+proyecto); 
            }
        }*/
        
        Evaluador e = new Evaluador();
        List<Evaluador> lista = oper.consultarevaluadores();
        System.out.println("Lista: "+lista);
        if(lista.size() >0){
            System.out.println("Hay datos");
            for(Evaluador evaluador : lista){
                System.out.println("Datos de evaluadores de: "+evaluador);
            }
        }
        
        Calendario c = new Calendario();
        
    }
}
