/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logicafaceboot;

import interfaces.ILogica;

/**
 *
 * @author Admin
 */
public class FabricaLogica {
   // private static ILogica logica;
    
    public static ILogica crearLogica(){
        return new Logica();
    }
}
