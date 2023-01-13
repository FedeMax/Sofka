package entidad;

import java.util.Scanner;

public final class vehiculo_Lanzadera extends vehiculoEspacial {

    private String carga;
    private String combustible;

    public vehiculo_Lanzadera() {
    }

    public vehiculo_Lanzadera(String carga, String combustible, String nombre, String nacionalidad, double peso, int tamanho, int capaDeCarga, boolean activo) {
        super(nombre, nacionalidad, peso, tamanho, capaDeCarga, activo);
        this.carga = carga;
        this.combustible = combustible;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
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
        System.out.println("Ingrese el tipo de carga que se llevara en la nave");
        this.carga=leer.next();
        System.out.println("Indique el tipo de combustible que usara la nave");
        this.combustible = leer.next();
    }

   
    @Override
    public String toString() {
        return super.toString()+ "\ncarga de la aernove: "+carga+"\tcombustible utilizado: "+combustible;
    }

    

}
