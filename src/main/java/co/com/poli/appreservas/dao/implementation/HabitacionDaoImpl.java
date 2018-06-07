/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.dao.implementation;

import co.com.poli.appreservas.dao.IHabitacionDao;
import co.com.poli.appreservas.data.habitacionData;
import co.com.poli.appreservas.model.habitacion;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class HabitacionDaoImpl implements IHabitacionDao{

    @Override
    public List<habitacion> obtenerListahabitaciones() {
        return habitacionData.getListaHabitaciones();
    }

    @Override
    public String crearHabitacion(habitacion hab) {
        List<habitacion>listaHab = habitacionData.getListaHabitaciones();
        listaHab.add(hab);
        habitacionData.setListaHabitaciones(listaHab);
        return "Habitacion creada";
        
    }

    @Override
    public habitacion obtenerHabitacion(String idhabitacion) {
        habitacion hab = null;
        List<habitacion>habList = habitacionData.getListaHabitaciones();
        for (habitacion listhab : habList) {
            if(listhab.getIdHabitacion().equals(idhabitacion)){
                hab = listhab;
            }
        }
        return hab;
    }
    
    
}
