/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calendario.dto;

/**
 *
 * @author Daniela Calderón Vela
 */
public class Evaluador {
   private int identificacion;
   private String nombre;
   private String apellidos;
   private String telefono;
   private String correo;

   public Evaluador(){
       
   }  

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     
    public String toString(){
        //return "serial : "+this.serial +" referencia : "+this.referencia;
        return "Nombre : "+this.nombre+" Apellidos : "+this.apellidos;
    }
    
    /*
    CREATE TABLE public.consultaevaluadores
    (
    identificacionevaluador bigint NOT NULL,
    nombreevaluador character varying COLLATE pg_catalog."default",
    apellidosevaluador character varying COLLATE pg_catalog."default",
    telefonoevaluador character varying COLLATE pg_catalog."default",
    correoevaluador character varying COLLATE pg_catalog."default",
    CONSTRAINT "pk_Evaluador" PRIMARY KEY (identificacionevaluador)
    )

    TABLESPACE pg_default;

    ALTER TABLE public.consultaevaluadores
        OWNER to postgres;
    
    INSERT INTO public.consultaevaluadores
    (identificacionevaluador, nombreevaluador, apellidosevaluador, telefonoevaluador, correoevaluador)values(1,'Kelvin', ' Vega ', '123456', 'kvega@ucentral.edu.co');
    INSERT INTO public.consultaevaluadores
    (identificacionevaluador, nombreevaluador, apellidosevaluador, telefonoevaluador, correoevaluador)values(2,'Kyle', ' Lee ', '7891011', 'klee@ucentral.edu.co');
    INSERT INTO public.consultaevaluadores
    (identificacionevaluador, nombreevaluador, apellidosevaluador, telefonoevaluador, correoevaluador)values(3,'Anton ', ' Arellano ', '12131415', 'aarrellano@ucentral.edu.co');
    INSERT INTO public.consultaevaluadores
    (identificacionevaluador, nombreevaluador, apellidosevaluador, telefonoevaluador, correoevaluador)values (4,' Samara ', ' Mackie ', '16171819', 'smackie@ucentral.edu.co');
    INSERT INTO public.consultaevaluadores
    (identificacionevaluador, nombreevaluador, apellidosevaluador, telefonoevaluador, correoevaluador)values (5,' Johnny ', ' Mcleod ', '20212223', 'jmcleod@ucentral.edu.co');

    */
}
