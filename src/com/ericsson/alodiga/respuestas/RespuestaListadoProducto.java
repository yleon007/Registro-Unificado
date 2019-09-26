/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericsson.alodiga.respuestas;

/**
 *
 * @author ltoro
 */
public class RespuestaListadoProducto {
    
    private Float saldoActual;
    private String NombreProducto;

        public RespuestaListadoProducto(Float saldoActual, String NombreProducto) {
        this.saldoActual = saldoActual;
        this.NombreProducto = NombreProducto;
    }
    
    
    public Float getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

}
