/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.business;

import co.com.poli.appreservas.model.reservas;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public interface IReservasBus {
    
    List<reservas>obtenerListareservas();
    String crearReserva(reservas res);
    reservas obtenerReserva(String idreserva);
    
}
