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
public class Proyecto {
    private String nombre;
    private int practica;
    private String estudiante1;
    private String estudiante2;
    private String estudiante3;
    
    public Proyecto(){
        
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

    public String getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(String estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public String getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(String estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public String getEstudiante3() {
        return estudiante3;
    }

    public void setEstudiante3(String estudiante3) {
        this.estudiante3 = estudiante3;
    }
    
    @Override
    public String toString(){
        return "nombreproyecto : " +this.nombre +"Numero de practica: "+this.practica;
    }
    
    /*
    CREATE TABLE public.consultaproyectos
    (
    "nombreproyecto " character varying COLLATE pg_catalog."default" NOT NULL,
    "numeropractica " bigint,
    "estudiante1 " character varying COLLATE pg_catalog."default",
    estudiante2 character varying COLLATE pg_catalog."default",
    estudiante3 character varying COLLATE pg_catalog."default",
    CONSTRAINT "pk_Proyecto" PRIMARY KEY ("nombreproyecto ")
    )

    TABLESPACE pg_default;

    ALTER TABLE public.consultaproyectos
        OWNER to postgres;
    
    INSERT INTO public.consultaproyectos
    (nombreproyecto, numeropractica, estudiante1, estudiante2, estudiante3)values('aplicación para el reconocimiento de publicidad', 2, 'Maddie ziegler', 'Sia Kate Isobelle', 'shia labeouf');
    INSERT INTO public.consultaproyectos
    (nombreproyecto, numeropractica, estudiante1, estudiante2, estudiante3)values('Publicidad por medio de código QR', 1, 'Tommy Portimo', ' Henrik Klingenberg', 'Elias Viljanen');
    INSERT INTO public.consultaproyectos
    (nombreproyecto, numeropractica, estudiante1, estudiante2, estudiante3)values('Plataforma de atención a discapacitados', 4, ' Elize Ryd', 'Nils Molin', 'Jake E');
    INSERT INTO public.consultaproyectos
    (nombreproyecto, numeropractica, estudiante1, estudiante2, estudiante3)values('Sistema para la gestión de datos de un conjunto residencial', 3, ' Angelina Germanotta', 'Colby ODonis', 'Giselle Knowles');
    INSERT INTO public.consultaproyectos
    (nombreproyecto, numeropractica, estudiante1, estudiante2, estudiante3)values('Sistema para las clases virtuales de la universidad central', 5, 'Rie Kaneko', 'Rei Kuromiya ', 'Richard Magarey');

    */
}
