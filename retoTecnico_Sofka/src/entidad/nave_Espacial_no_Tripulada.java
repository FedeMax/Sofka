/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Mega
 */
public final class nave_Espacial_no_Tripulada extends vehiculoEspacial {

    private String planetaAsignado;

    public nave_Espacial_no_Tripulada(){
        
    }


    public nave_Espacial_no_Tripulada(String planetaAsignado, String nombre, String nacionalidad, double peso, int tamanho, int capaDeCarga, boolean activo) {
        super(nombre, nacionalidad, peso, tamanho, capaDeCarga, activo);
        this.planetaAsignado = planetaAsignado;
    }

    public String getPlanetaAsignado() {
        return planetaAsignado;
    }

    public void setPlanetaAsignado(String planetaAsignado) {
        this.planetaAsignado = planetaAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCapaDeCarga() {
        return capaDeCarga;
    }

    public void setCapaDeCarga(int capaDeCarga) {
        this.capaDeCarga = capaDeCarga;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

  

    
    

    @Override
    public void cargaDeDatos() {
        super.cargaDeDatos();
        System.out.println("Indique el nombre del cuerpo celeste a observar");
        this.planetaAsignado = leer.next();
       
    }

 

    @Override
    public String toString() {
        return super.toString()+"\nPlaneta Asignado: "+planetaAsignado+"\tActivo: "+activo;
    }



}
