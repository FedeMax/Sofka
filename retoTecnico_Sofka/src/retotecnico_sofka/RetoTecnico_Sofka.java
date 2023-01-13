package retotecnico_sofka;

import Service.claseServicio;
import entidad.nave_Espacial_Tripulada;
import entidad.nave_Espacial_no_Tripulada;
import entidad.vehiculo_Lanzadera;
import java.util.ArrayList;
import java.util.Scanner;

public class RetoTecnico_Sofka {

    public static void main(String[] args) {

        boolean salir = true;//Sirve para terminar el ciclo del menu
        claseServicio servicio = new claseServicio();//inicializamos la clase que se encarga de todos los datos
        Scanner leer = new Scanner(System.in);//ingreso por teclado

        ArrayList<vehiculo_Lanzadera> navesDeLanzadera = new ArrayList<>();                 //los
        ArrayList<nave_Espacial_no_Tripulada> navesNoTripuladas = new ArrayList<>();   //3 tipos
        ArrayList<nave_Espacial_Tripulada> navesTripuladas = new ArrayList<>();             //de naves

        do {//Menu desde se inicia y se dirigira los procesos

            System.out.println("");
            int selector = 0;
            System.out.println("Menu");
            System.out.println("Seleccione que desea hacer");
            System.out.println("1) Crear una Aeronave");
            System.out.println("2) Ver los tipos de Aeronaves");
            System.out.println("3) Filtrar lista de Aeronaves por  parametro");
            System.out.println("4) Salir y Finalizar");

            while (selector != 1 && selector != 2 && selector != 3 && selector != 4) {//se limita las opciones de la persona para no generar error en el menu
                selector = leer.nextInt();
                if (selector != 1 && selector != 2 && selector != 3 && selector != 4) {
                    System.out.println("Opcion no disponible");
                }
                System.out.println("");

                switch (selector) {
                    case 1://Desde aqui se crearan las Aeronaves
                        servicio.creador(navesDeLanzadera, navesNoTripuladas, navesTripuladas);
                        break;

                    case 2://Desde aqui veremos la lista que tenemos de cada aeronave o todas en conjunto
                        servicio.lista(navesDeLanzadera, navesNoTripuladas, navesTripuladas);
                        break;

                    case 3://Podemos buscar por parametros simples una aeronave en especifico o algunas
                        //que cumplan con las caracteristicas
                        servicio.prefiltrador(navesDeLanzadera, navesNoTripuladas, navesTripuladas);

                        break;

                    case 4://Se cierra el programa y termina la ejecucion
                        salir = false;
                        System.out.println("Saliendo del programa");

                        break;
                }

            }

        } while (salir);

    }

}
