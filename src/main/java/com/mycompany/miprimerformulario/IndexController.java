/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprimerformulario;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author usuario
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {
    
private String Nombre;
private String Apellido;
private String Cedula;
private String Dias_trabajados;
    /**
     * Creates a new instance of IndexController
     */
    public void click(){
        System.out.println("Nombre :"  +Nombre );
        System.out.println("Apellido : " +this.Apellido);
        System.out.println("Cedula : " +this.Cedula);
        System.out.println("Días trabajados: "+this.Dias_trabajados);
    }
    public IndexController() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDias_trabajados() {
        return Dias_trabajados;
    }

    public void setDias_trabajados(String Dias_trabajados) {
        this.Dias_trabajados = Dias_trabajados;
    }
    
}
