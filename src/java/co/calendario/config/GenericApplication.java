/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calendario.config;

import co.calendario.servicios.ServCalendario;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Daniela Calderón Vela
 */
@ApplicationPath("app")
public class GenericApplication extends ResourceConfig{
    public GenericApplication (){
        register(ServCalendario.class);    // Estas son las clases que contienen los servicios
        register(new CORSFilter());
        register(new CORSRequestFilter());
    }
}