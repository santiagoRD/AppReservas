/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.business;

import co.com.poli.appreservas.model.habitacion;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public interface IHabitacionBus {
    
    List<habitacion>obtenerListahabitaciones();
    String crearHabitacion(habitacion hab);
    habitacion obtenerHabitacion(String idhabitacion);
    int numeroCamas(habitacion hab);
    
}
