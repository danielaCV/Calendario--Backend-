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
public class Espacios {
    private String nombre;
    private int practica;
    private String direccion; 
    private int capacidad;

    public Espacios(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPractica() {
        return practica;
    }

    public void setPractica(int practica) {
        this.practica = practica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /*
    
    CREATE TABLE public.registroespacios
    (
    nombreespacio character varying COLLATE pg_catalog."default" NOT NULL,
    direccionespacio character varying COLLATE pg_catalog."default",
    capacidadespacio bigint,
    CONSTRAINT pk_registroespacios PRIMARY KEY (nombreespacio)
    )

    TABLESPACE pg_default;

    ALTER TABLE public.registroespacios
        OWNER to postgres;
    
    */
}
