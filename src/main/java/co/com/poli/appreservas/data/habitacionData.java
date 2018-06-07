/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.data;

import co.com.poli.appreservas.model.habitacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class habitacionData {
    
    private static List<habitacion> listaHabitaciones;
    
    static {
        listaHabitaciones = new ArrayList<habitacion>(){
            {
                add(new habitacion("123", "Compartida", 5, "no"));
            }
        };
    }

    public static List<habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public static void setListaHabitaciones(List<habitacion> aListaHabitaciones) {
        listaHabitaciones = aListaHabitaciones;
    }
    
}
