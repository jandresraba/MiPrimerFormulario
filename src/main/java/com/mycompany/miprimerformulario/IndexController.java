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
private String Nivel_Estudio;
private String Idiomas []; 

    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
        this.Idiomas = new String [5];
    }     

    public void click(){
        System.out.println("Nombre :"  +Nombre );
        System.out.println("Apellido : " +this.Apellido);
        System.out.println("Cedula : " +this.Cedula);
        System.out.println("Días trabajados: "+this.Dias_trabajados);
        System.out.println("Nivel estudio: "+this.Nivel_Estudio);
        for(int i = 0;i<=Idiomas.length; i++ ){
            if(i==1){
                System.out.println("Ingles");
            }
            //System.out.println(Idiomas[i]);
        }
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

    public String getNivel_Estudio() {
        return Nivel_Estudio;
    }

    public void setNivel_Estudio(String Nivel_Estudio) {
        this.Nivel_Estudio = Nivel_Estudio;
    }

    public String[] getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(String[] Idiomas) {
        this.Idiomas = Idiomas;
    }

   
    
}
