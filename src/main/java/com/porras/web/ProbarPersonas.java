/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.porras.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author T107
 */
public class ProbarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ServiciosPeņa.class);
       Persona p=ctx.getBean(Persona.class);
      System.out.println( p.ejecutarGracia());
    }
    
}
