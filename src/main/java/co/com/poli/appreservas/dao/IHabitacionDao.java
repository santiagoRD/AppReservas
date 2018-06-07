/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.dao;

import co.com.poli.appreservas.model.habitacion;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public interface IHabitacionDao {
    
    List<habitacion>obtenerListahabitaciones();
    String crearHabitacion(habitacion hab);
    habitacion obtenerHabitacion(String idhabitacion);
    
}
