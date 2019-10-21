package com.ericsson.alodiga.utils;


import com.alodiga.twilio.sms.services.TwilioSmsSender;
import com.alodiga.twilio.sms.services.TwilioSmsSenderProxy;
import com.ericsson.alodiga.model.Usuario;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SendSmsThread extends Thread {
    private static final long serialVersionUID = 1L;
    private String movil;
    private String codigo;
    private Long languageId;
    private Integer sendSmsType;
    private Usuario usuario;

    public SendSmsThread(String movil, String codigo_)  {
       this.codigo = codigo_;
       this.movil = movil;
    }
    
    
    public SendSmsThread(String movil, Usuario usuario ,Integer sendSmsType) {
        this.movil = movil;
        this.usuario = usuario;
        this.sendSmsType = sendSmsType;
    }
    
     public SendSmsThread(String movil, String codigo_,Long languageId)  {
       this.codigo = codigo_;
       this.movil = movil;
       this.languageId = languageId;
    }
    

    public void run() {
        String message = null;
        
        switch (sendSmsType) {
            
            
            case Constante.SEND_TYPE_SMS_REGISTER:
            // code block
             message = getLangujeByPhoneNumber(usuario.getMovil()).equals(Constante.SPANISH_LANGUAGE) ? "Billetera Alodiga, Usted se ha registrado satisfactoriamente: " + new Timestamp(new java.util.Date().getTime()) + " " +  usuario.getEmail() : "Alodiga Wallet, You have successfully registered: " + new Timestamp(new java.util.Date().getTime()) + " " + usuario.getEmail();
                 break;                
            
        }
        
        try {
            //String message = getLangujeByPhoneNumber(movil).equals(Constante.SPANISH_LANGUAGE) ? "Billetera Alodiga, Su codigo de seguridad para el registro es: " + codigo : "Alodiga Wallet, Your security code is: " + codigo ;
            TwilioSmsSenderProxy proxy = new TwilioSmsSenderProxy();
            proxy.sendTwilioSMS(movil, message);

        } catch (RemoteException ex) {
           ex.printStackTrace();
        }
    }
    
    
   
    private Long getLangujeByPhoneNumber(String phone){
           if(phone.substring(0, 1).equals("1")){
               return Constante.ENGLISH_LANGUAGE;
            }else{
                return Constante.SPANISH_LANGUAGE; 
           }
    }
    
    
}
