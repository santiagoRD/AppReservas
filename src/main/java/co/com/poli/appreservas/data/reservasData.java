/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.data;

import co.com.poli.appreservas.model.reservas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class reservasData {
    
    private static List<reservas>listaReservas;
    static{
        listaReservas = new ArrayList<reservas>(){
            {
                add(new reservas("234", "123", 2, 30.000));
            }
        };
    }

    public static List<reservas> getListaReservas() {
        return listaReservas;
    }

    public static void setListaReservas(List<reservas> aListaReservas) {
        listaReservas = aListaReservas;
    }
    
    
}
