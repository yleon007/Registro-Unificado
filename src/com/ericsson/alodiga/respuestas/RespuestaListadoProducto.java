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
    private Long id;
    private Float saldoActual;
    private String nombreProducto;
    private String simbolo;
    private Boolean isPayTopUP;
    private Boolean isUsePrepaidCard;
    
    
        public RespuestaListadoProducto(Long id, Float saldoActual, String nombreProducto,String simbolo,Boolean isPayTopUP, Boolean isUsePrepaidCard ) {
        this.saldoActual = saldoActual;
        this.nombreProducto = nombreProducto;
        this.simbolo = simbolo;
        this.id = id;
        this.isPayTopUP = isPayTopUP;
        this.isUsePrepaidCard = isUsePrepaidCard;
    
    }


    
    
    public Float getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Boolean getIsPayTopUP() {
        return isPayTopUP;
    }

    public void setIsPayTopUP(Boolean isPayTopUP) {
        this.isPayTopUP = isPayTopUP;
    }

    public Boolean getIsUsePrepaidCard() {
        return isUsePrepaidCard;
    }

    public void setIsUsePrepaidCard(Boolean isUsePrepaidCard) {
        this.isUsePrepaidCard = isUsePrepaidCard;
    }

    @Override
    public String toString() {
        return "RespuestaListadoProducto{" + "id=" + id + ", saldoActual=" + saldoActual + ", nombreProducto=" + nombreProducto + ", simbolo=" + simbolo + ", isPayTopUP=" + isPayTopUP + ", isUsePrepaidCard=" + isUsePrepaidCard + '}';
    }
    
    

    

}
