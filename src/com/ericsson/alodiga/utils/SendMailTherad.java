/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericsson.alodiga.utils;

import java.util.List;
import java.util.Map;
import javax.ejb.EJB;




/**
 *
 * @author usuario
 */
public class SendMailTherad extends Thread {

    
    private String parameter1;
    private String parameter2;
    private String name;
    private Float  amount2;
    private Integer sendType;
    
    //registro
    public SendMailTherad(String parameter1, String parameter2, String name,Integer sendType ) {
    
      this.parameter1 = parameter1;
      this.parameter1 = parameter2;
      this.name = name;
      this.sendType = sendType;
              
        
    }
    //Compra de saldo
    public SendMailTherad(String parameter1, String parameter2, String name,String amount,Integer sendType) {
    
    }
       //Compra En tienda
    public SendMailTherad(String parameter1, String parameter2, String name,Float amount2,Integer sendType) {
    
    }
 

    public void run() {
     
        
        
        
        
        // Hace el envio
    }

}
