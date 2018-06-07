/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.dao.implementation;

import co.com.poli.appreservas.dao.IReservasDao;
import co.com.poli.appreservas.data.reservasData;
import co.com.poli.appreservas.model.reservas;
import java.util.List;

/**
 *
 * @author SANTIAGO
 */
public class ReservaDaoImpl implements IReservasDao{

    @Override
    public List<reservas> obtenerListareservas() {
        return reservasData.getListaReservas();
    }

    @Override
    public String crearReserva(reservas res) {
        List<reservas>resList = reservasData.getListaReservas();
        resList.add(res);
        reservasData.setListaReservas(resList);
        return "Reserva creada";
    }

    @Override
    public reservas obtenerReserva(String idreserva) {
        reservas res = null;
        List<reservas>resList = reservasData.getListaReservas();
        for (reservas listRes : resList) {
            if(listRes.getIdReserva().equals(idreserva)){
                res = listRes;
            }
        }
        return res;
    }
    
}
