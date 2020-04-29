/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.calendario.interfaces;

import co.calendario.dto.Calendario;
import co.calendario.dto.Espacios;
import co.calendario.dto.Evaluador;
import co.calendario.dto.Proyecto;
import java.util.List;

/**
 *
 * @author Daniela Calderón Vela
 */
public interface OperacionCalendario {
    public int registrarespacios(Espacios dato);
    public List<Proyecto> consultarproyectos(String dato);
    public List<Proyecto> consultarproyectos();
    public List<Evaluador> consultarevaluadores(String dato);
    public List<Evaluador> consultarevaluadores();
    /*public int registroFecha(Calendario dato);*/
}
