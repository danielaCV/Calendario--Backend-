/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calendario.servicios;

/**
 *
 * @author Daniela Calderón Vela
 */
public class Mensajes {
    public static final int COD_EXITO = 0;
    public static final int COD_EXITO1 = 1;
    public static final int COD_EXITO2 = 2;
    public static final int COD_EXITO3 = 3;
    
    public static final String MENSAJE_EXITO ="Registro exitoso de los espacios fisicos de exposicion";
    public static final String MENSAJE_EXITO1 ="Consulta exitosa de los proyectos registrados";
    public static final String MENSAJE_EXITO2 ="Consulta exitosa de los evaluadores registrados";
    public static final String MENSAJE_EXITO3 ="Registro exitoso de fecha y hora de prsentacion de proyectos";
    
    public static final int COD_ERR_BD = 10;
    public static final String MENSAJE_ERR_BD = "Se genero inconveniente en la conexion a la BD intentelo de nuevo";
    
    public static final int COD_ERR_NODATA = 20;
    public static final String MENSAJE_ERR_NODATA = "No se registro el espacio fisico de exposicion";
    public static final String MENSAJE_ERR_NODATA1 = "No se encuentra la informacion de la consulta de proyectos";
    public static final String MENSAJE_ERR_NODATA2 = "No se encuentra la informacion de la consulta de evaluadores";
    public static final String MENSAJE_ERR_NODATA3 = "No se registro la fecha y hora de de prsentacion de proyectos";
}   