/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lchaqui.modelo;

import com.lchaqui.modelo.Tiempo1;

/**
 *
 * 
 */

//Errores que se producen al tratar de acceder a los miembros private de Tiempo1

public class PruebaTiempo2 {
    Tiempo1 hora = new Tiempo1();
    
    tiempo.hora = 7; //error, hora es una variable de instancia privada
    tiempo.minuto = 15; //error, minuto es una variable de instancia privada
    tiempo.segundo = 30; //error, segundo es una variable de instancia privada
    
}//fin de la clase PruebaTiempo2
