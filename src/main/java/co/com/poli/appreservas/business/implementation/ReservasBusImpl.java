/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.business.implementation;

import co.com.poli.appreservas.business.IReservasBus;
import co.com.poli.appreservas.dao.implementation.ReservaDaoImpl;
import co.com.poli.appreservas.model.reservas;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class ReservasBusImpl implements IReservasBus{

    
    private ReservaDaoImpl reservaDaoImpl = new ReservaDaoImpl();
    @Override
    public List<reservas> obtenerListareservas() {
        return reservaDaoImpl.obtenerListareservas();
    }

    @Override
    public String crearReserva(reservas res) {
        String msj = "Reserva existente";
        reservas rsrv = obtenerReserva(res.getIdReserva());
        if(rsrv == null){
            msj = reservaDaoImpl.crearReserva(res);
        }
        return msj;
    }

    @Override
    public reservas obtenerReserva(String idreserva) {
        return reservaDaoImpl.obtenerReserva(idreserva);
    }
    
}
