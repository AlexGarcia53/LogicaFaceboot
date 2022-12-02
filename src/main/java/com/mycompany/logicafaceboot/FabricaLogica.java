/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logicafaceboot;

import interfaces.ILogica;

/**
 * Clase que representa una fabrica que construye objetos del tipo ILogica.
 * @author Equipo Broker.
 */
public class FabricaLogica {
    /**
     * Método utilizado para obtener una nueva instancia del tipo ILogica.
     * @return Instancia del tipo ILogica.
     */
    public static ILogica crearLogica(){
        return new Logica();
    }
}
