/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.business.implementation;

import co.com.poli.appreservas.business.IHabitacionBus;
import co.com.poli.appreservas.dao.implementation.HabitacionDaoImpl;
import co.com.poli.appreservas.model.habitacion;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class HabitacionBusImpl implements IHabitacionBus{

    private HabitacionDaoImpl habitacionDaoImpl = new HabitacionDaoImpl();
    @Override
    public List<habitacion> obtenerListahabitaciones() {
        return habitacionDaoImpl.obtenerListahabitaciones();
    }

    @Override
    public String crearHabitacion(habitacion hab) {
        String msj = "Habitacion existente";
        habitacion room = obtenerHabitacion(hab.getIdHabitacion());
        if(room == null){
            msj=habitacionDaoImpl.crearHabitacion(hab);
        }
        return msj;
    }

    @Override
    public habitacion obtenerHabitacion(String idhabitacion) {
        return habitacionDaoImpl.obtenerHabitacion(idhabitacion);
    }

    @Override
    public int numeroCamas(habitacion hab) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
