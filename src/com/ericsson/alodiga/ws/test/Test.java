/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ericsson.alodiga.ws.test;

import com.ericsson.alodiga.model.Cuenta;
import com.ericsson.alodiga.model.Usuario;
import com.ericsson.alodiga.utils.SendMailTherad;

/**
 *
 * @author ltoro
 */
public class Test {
    
    
    public static void main(String[] args){      
        Usuario usuario = new Usuario();
        usuario.setNombre("Kerwin");
        usuario.setApellido("Gomez");
        usuario.setCredencial("231231231");
        usuario.setEmail("mgraterol@alodiga.com");
        usuario.setMovil("584241934005");
        Cuenta cunCuenta = new Cuenta();
        cunCuenta.setNumeroCuenta("01050614154515461528");
        usuario.setCuenta(cunCuenta);
        SendMailTherad sendMailTherad = new SendMailTherad("ES", usuario, Integer.valueOf("1"));
                    sendMailTherad.run();
        
    }
    
    
}
