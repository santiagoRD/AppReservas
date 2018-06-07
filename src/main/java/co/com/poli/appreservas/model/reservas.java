/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appreservas.model;

import java.util.Objects;

/**
 *
 * @author SANTIAGO
 */
public class reservas {
    
    private String idReserva;
    private String idhabitacion;
    private int numCamas;
    private Double precioxCama;

    public reservas(String idReserva, String idhabitacion, int numCamas, Double precioxCama) {
        this.idReserva = idReserva;
        this.idhabitacion = idhabitacion;
        this.numCamas = numCamas;
        this.precioxCama = precioxCama;
    }

    
    
    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getHabitacion() {
        return idhabitacion;
    }

    public void setHabitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public Double getPrecioxCama() {
        return precioxCama;
    }

    public void setPrecioxCama(Double precioxCama) {
        this.precioxCama = precioxCama;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idReserva);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final reservas other = (reservas) obj;
        if (!Objects.equals(this.idReserva, other.idReserva)) {
            return false;
        }
        return true;
    }

   
    
}
