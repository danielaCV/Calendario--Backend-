/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calendario.servicios;

import co.calendario.dao.OperCalendarioTM;
import co.calendario.dto.Espacios;
import co.calendario.dto.Evaluador;
import co.calendario.dto.Proyecto;
import co.calendario.dto.RespuestaCalendario;
import co.calendario.dto.RespuestaEspacios;
import co.calendario.dto.RespuestaEvaluador;
import co.calendario.dto.RespuestaProyecto;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Daniela Calderón Vela
 */
@Path("operaciones")
public class ServCalendario {
    
    @Path("registroespacio")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaEspacios registroespacios(Espacios dato){
        RespuestaEspacios re = new RespuestaEspacios();
        re.setCodigo(Mensajes.COD_EXITO);
        re.setMensaje(Mensajes.MENSAJE_EXITO);
        OperCalendarioTM oper = new OperCalendarioTM();
        oper.registrarespacios(dato);
        return re;
    }
    
    @Path("consultaproyectos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaProyecto consultaproyectos(){
        RespuestaProyecto rp = new RespuestaProyecto();
        rp.setCodigo(Mensajes.COD_EXITO1);
        rp.setMensaje(Mensajes.MENSAJE_EXITO1);
        OperCalendarioTM oper = new OperCalendarioTM();
        List<Proyecto> lista = oper.consultarproyectos();
        rp.setProyectos(lista);
        return rp;
    }
    
    @Path("consultaevaluadores")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaEvaluador consultaevaluadores(){
        RespuestaEvaluador re = new RespuestaEvaluador();
        re.setCodigo(Mensajes.COD_EXITO2);
        re.setMensaje(Mensajes.MENSAJE_EXITO2);
        OperCalendarioTM oper = new OperCalendarioTM();
        List<Evaluador> lista = oper.consultarevaluadores();
        re.setEvaluadores(lista);
        return re;
    }
    
   /* @Path("registrofecha")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaCalendario registrofecha(){
        RespuestaCalendario rc = new RespuestaCalendario();
        rc.setCodigo(Mensajes.COD_EXITO3);
        rc.setMensaje(Mensajes.MENSAJE_EXITO3);
        OperCalendarioTM oper = new OperCalendarioTM();
        return rc;
    }*/
}