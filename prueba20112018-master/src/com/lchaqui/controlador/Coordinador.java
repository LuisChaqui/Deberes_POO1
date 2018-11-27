/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lchaqui.controlador;

import com.lchaqui.modelo.Empleado;
import com.lchaqui.vista.EditaDatos;
import com.lchaqui.vista.Login;
import java.util.ArrayList;

/**
 *
 * @author PC6-LAB2
 */
public class Coordinador {
    Login login = new Login (this);
    EditaDatos editaDatos =new  EditaDatos (this);
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public void agregarEmpleado(Empleado e){
     empleados.add(e);
        System.out.println("EMPLEADO CREADO");
    }
}
