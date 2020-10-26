/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprimerformulario;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author usuario
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {
    
private String nombre;
private String apellido;
private String cedula;
private String nivelEstudio;
private String diasTrabajados;
private List<String> idiomasSeleccionados;//Lista para almacenar elementos seleccionados.
private List<String> listaIdiomas;//Lista para almacenar elementos seleccionados

    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
        idiomasSeleccionados = new ArrayList<String>();
        idiomasSeleccionados.add("Ingles"); 
        idiomasSeleccionados.add("Frances");
        idiomasSeleccionados.add("Chino"); 
    }     

    public void click(){
        System.out.println("Nombre :"  +nombre );
        System.out.println("Apellido : " +this.apellido);
        System.out.println("Cedula : " +this.cedula);
        System.out.println("Días trabajados: "+this.diasTrabajados);
        System.out.println("Nivel estudio: "+this.nivelEstudio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(String diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public List<String> getIdiomasSeleccionados() {
        return idiomasSeleccionados;
    }

    public void setIdiomasSeleccionados(List<String> idiomasSeleccionados) {
        this.idiomasSeleccionados = idiomasSeleccionados;
    }

    public List<String> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(List<String> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }
    
    
}
