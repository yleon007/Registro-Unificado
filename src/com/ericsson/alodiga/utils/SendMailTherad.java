/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericsson.alodiga.utils;

import com.alodiga.wallet.ws.Transaction;
import com.ericsson.alodiga.model.Usuario;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;




/**
 *
 * @author usuario
 */
public class SendMailTherad extends Thread {

      
    
    
    private String idioma;
    private Usuario usuario;
    private Transaction transaction;
    private Float oldAmount;
    private Float currentAmount;
    private Integer sendType;
    
    
    
    
     /**
     * Método que devuelve el número de ítems (números aleatorios) existentes en la serie
     * @return El número de ítems (números aleatorios) de que consta la serie
     * @param 
     */
    public SendMailTherad(String idioma, Usuario usuario,Integer sendType ) {
    
      this.idioma = idioma;
      this.usuario = usuario;      
      this.sendType = sendType;
              
        
    }
    //Compra de saldo
    public SendMailTherad(String idioma, Usuario usuario, Transaction transaction, Float oldAmount, Float currentAmount, Integer sendType) {
    
      this.idioma = idioma;
      this.usuario = usuario;      
      this.transaction = transaction;
      this.oldAmount = oldAmount;
      this.currentAmount = currentAmount; 
      this.sendType = sendType;
        
        
    }
    
 

    public void run() {
      Mail mail = null; 
        switch (sendType) {
            case Constante.SEND_TYPE_EMAIL_COMPRA:
                // code block
                mail = Utils.enviarCorreUsuarioCompraSaldo("ES", usuario, transaction, oldAmount, currentAmount);
                break;
            case Constante.SEND_TYPE_EMAIL_RECHARGE:
                // code block
                mail = Utils.enviarCorreUsuarioRetiro("ES", usuario, transaction, oldAmount, currentAmount);
                break;
            case Constante.SEND_TYPE_EMAIL_REGISTER:
            // code block
                mail = Utils.enviarCorreUsuarioNuevoAplicacionMovil("ES", usuario);
                break;                
            case Constante.SEND_TYPE_EMAIL_CHANGE_PASSWORD:
            // code block
                mail = Utils.enviarCorreUsuarioCambioContraseña("ES", usuario);
                break;
            case Constante.SEND_TYPE_EMAIL_COMERCE_PEYMENT:
            // code block
                mail = Utils.enviarCorreUsuarioPagoComercio("ES", usuario, transaction, oldAmount, currentAmount);
                break;
        }
        
        // Hace el envio
        try {
            AmazonSESSendMail.SendMail(mail.getSubject(), mail.getBody(), mail.getTo().get(0));
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(SendMailTherad.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

}
