package entidad;

import java.util.Locale;
import java.util.Scanner;

public abstract class vehiculoEspacial {
    //Clase padre desde la que naceran el resto de las clases, la declare abstracta porque este tipo de aeronabe cumple una funcion especifica
    protected String nombre;
    protected String nacionalidad;
    protected double peso;
    protected int tamanho;
    protected int capaDeCarga;
    protected boolean activo;

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.ENGLISH);

    public vehiculoEspacial() {
    }

    public vehiculoEspacial(String nombre, String nacionalidad, double peso, int tamanho, int capaDeCarga, boolean activo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.tamanho = tamanho;
        this.capaDeCarga = capaDeCarga;
        this.activo = activo;
    }

    public void cargaDeDatos() {//carga de datos genericos se heredara en las subclases

        System.out.println("Ingrese el nombre de la nave");
        this.nombre = leer.next();
        System.out.println("Ingrese el pais donde fue construida");
        this.nacionalidad = leer.next();
        System.out.println("Ingrese el peso de la aeronave en toneladas");
        this.peso = leer.nextDouble();
        System.out.println("Ingrese el tamaño de la aeronave");
        this.tamanho = leer.nextInt();
        System.out.println("Ingrese la capacidad de carga de la aeronave");
        this.capaDeCarga = leer.nextInt();
        boolean lector = true;
        String indicador = null;
        while (lector) {
            do {
                System.out.println("Indique si se encuentra en servicio activo la nave");
                System.out.println("Activo ---> si");
                System.out.println("Inactivo -->no");
                indicador = leer.next();
                if (indicador.toLowerCase().equals("si")) {
                    lector = false;
                    this.activo=true;
                } else if (indicador.toLowerCase().equals("no")) {
                    lector = false;
                    this.activo=false;
                }
            } while (lector);

        }

    }


    @Override
    public String toString() {
        return "\nnombre: " + nombre + "\t Pais de origen: " + nacionalidad + "\tpeso: " + peso + " toneldas" + "\ntamaño: " + tamanho + " metros " + "\t capacidad de carga: " + capaDeCarga + " ton."
                + "\n En servicio: " + activo;
    }

}
