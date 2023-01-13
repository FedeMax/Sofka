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
public final class nave_Espacial_Tripulada extends vehiculoEspacial {

    private int canDeTripulantes;
    private String funcDeLaNave;
    private String destino;
    
    public  nave_Espacial_Tripulada(){
        
    }

    public nave_Espacial_Tripulada(int canDeTripulantes, String funcDeLaNave, String destino, String nombre, String nacionalidad, double peso, int tamanho, int capaDeCarga, boolean activo) {
        super(nombre, nacionalidad, peso, tamanho, capaDeCarga, activo);
        this.canDeTripulantes = canDeTripulantes;
        this.funcDeLaNave = funcDeLaNave;
        this.destino = destino;
    }

    public int getCanDeTripulantes() {
        return canDeTripulantes;
    }

    public void setCanDeTripulantes(int canDeTripulantes) {
        this.canDeTripulantes = canDeTripulantes;
    }

    public String getFuncDeLaNave() {
        return funcDeLaNave;
    }

    public void setFuncDeLaNave(String funcDeLaNave) {
        this.funcDeLaNave = funcDeLaNave;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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
        System.out.println("Ingrese el tamaño de la tripulacion");
        this.canDeTripulantes = leer.nextInt();
        System.out.println("Indique la funcion principal de la nave");
        this.funcDeLaNave = leer.next();
        System.out.println("Ingrese el destino al cual se dirige la nave");
        this.destino = leer.next();
         
    }

    
    @Override
    public String toString() {
        return super.toString()+"\nN° tripulantes: "+canDeTripulantes+"\tFun.Princ.de la Nave: "+funcDeLaNave+"\nDestino: "+destino;
    }

}
