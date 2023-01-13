package Service;

import entidad.nave_Espacial_Tripulada;
import entidad.nave_Espacial_no_Tripulada;
import entidad.vehiculo_Lanzadera;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class claseServicio {

    //Esta clase se accede desde el menu de la clase principal y por esta misma se realizan todas las acciones necesarias
    //Los unicos procedimientos que no se realizan desde aqui son las que se realizan desde las clases en si mismas
    Scanner leer = new Scanner(System.in);

    //decidi crear esta clase para poder ahorrar un poco de codigo y no estar repitiendo las selecciones de a 3
    public int elegir(int valor) {

        int devolver = valor;

        while (devolver > 3 || devolver < 0) {
            System.out.println("Ingrese un valor admitido 1 , 2 o 3");
            System.out.println("La opcion 4 solo esta permitida en el listado completo de naves");
            System.out.println("");
            devolver = leer.nextInt();
            if (devolver == 4) {
                return devolver;
            }
        }

        return devolver;
    }

//La clase creador funciona para poder crear las clases subhijas que se guardan en una collecion de clases
    //cada tipo de clase tiene su propio arraylist
    public void creador(ArrayList<vehiculo_Lanzadera> tipo1, ArrayList<nave_Espacial_no_Tripulada> tipo2, ArrayList<nave_Espacial_Tripulada> tipo3) {

        int selector;
        int seguir;
        do {

            seguir = 0;
            System.out.println("");
            System.out.println("Que tipo de nave desea ingresar?");
            System.out.println("Tipos de naves");
            System.out.println("1)Vehículos de Lanzadera");
            System.out.println("2)Nave Espacial no tripulada");
            System.out.println("3)Nave Espacial  tripulada");
            System.out.println("");

            selector = leer.nextInt();
            System.out.println("");
            do {
                selector = elegir(selector);
            } while (selector > 3 || selector < 1);

            switch (selector) {
                case 1:
                    System.out.println("Nave de tipo Lanzadera a crear");
                    vehiculo_Lanzadera deLanzadera = new vehiculo_Lanzadera();
                    deLanzadera.cargaDeDatos();

                    tipo1.add(deLanzadera);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Nave Espacial no tripulada a crear");
                    nave_Espacial_no_Tripulada noTripulada = new nave_Espacial_no_Tripulada();
                    noTripulada.cargaDeDatos();

                    tipo2.add(noTripulada);
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("Nave Espacial con Tripulacion a crear");
                    nave_Espacial_Tripulada tripuladas = new nave_Espacial_Tripulada();
                    tripuladas.cargaDeDatos();

                    tipo3.add(tripuladas);
                    System.out.println("");
                    break;
            }
            System.out.println("Desea crear otra nave o volver al menu");
            while (seguir != 1 && seguir != 2) {
                System.out.println("1)Seguir  \t 2)Salir");
                seguir = leer.nextInt();
            }
        } while (seguir == 1);

    }

    //Desde aqui se accede para poder ver los diferentes conjuntos de clases creadas
    //No se puede acceder a esta clase a menos que se creara algun tipo de lista
    public void lista(ArrayList<vehiculo_Lanzadera> tipo1, ArrayList<nave_Espacial_no_Tripulada> tipo2, ArrayList<nave_Espacial_Tripulada> tipo3) {

        int cantidadTotal = tipo1.size() + tipo2.size() + tipo3.size();

        if (cantidadTotal <= 0) {
            System.out.println("-------------------------------------");
            System.out.println("No hay naves en la lista aun");
            System.out.println("-------------------------------------");
        } else {
            System.out.println("");
            System.out.println("Seleccione la Lista de naves según el tipo");
            System.out.println("1)Nave de Lanzadera");
            System.out.println("2)Nave Espacial no tripulada");
            System.out.println("3)Nave Espacial  tripulada");
            System.out.println("4)Ver todas las Naves");
            System.out.println("");

            int selector = leer.nextInt();
            if (selector == 4) {

            } else if (selector > 4 || selector < 1) {
                selector = elegir(selector);
            }

            switch (selector) {
                case 1:
                    if (tipo1.size() < 1) {
                        System.out.println("-------------------------------------");
                        System.out.println("No hay naves en esta lista aun");
                        System.out.println("-------------------------------------");
                    } else {
                        for (vehiculo_Lanzadera lanzadera : tipo1) {

                            System.out.println("-------------------------------------");
                            System.out.println("Vehiculo espacial tipo: \tNave de Lanzadera");
                            System.out.println(lanzadera.toString());
                            System.out.println("");
                        }
                    }

                    System.out.println("-------------------------------------");
                    break;

                case 2:
                    if (tipo2.size() < 1) {
                        System.out.println("-------------------------------------");
                        System.out.println("No hay naves en esta lista aun");
                        System.out.println("-------------------------------------");
                    } else {
                        for (nave_Espacial_no_Tripulada noTripulada : tipo2) {

                            System.out.println("-------------------------------------");
                            System.out.println("Vehiculo espacial tipo: \tNave no Tripulada");
                            System.out.println(noTripulada.toString());
                            System.out.println("");
                        }
                    }

                    System.out.println("-------------------------------------");
                    break;

                case 3:
                    if (tipo3.size() < 1) {
                        System.out.println("-------------------------------------");
                        System.out.println("No hay naves en esta lista aun");
                        System.out.println("-------------------------------------");
                    } else {
                        for (nave_Espacial_Tripulada tripulada : tipo3) {

                            System.out.println("-------------------------------------");
                            System.out.println("Vehiculo espacial tipo: \tNave  Tripulada");
                            System.out.println(tripulada.toString());
                            System.out.println("");
                        }

                    }

                    System.out.println("-------------------------------------");
                    break;

                case 4:
                    System.out.println("Se procede a enlistar todas las naves");

                    System.out.println("-----------------------------------------------------------------");

                    for (vehiculo_Lanzadera lanzadera : tipo1) {
                        System.out.println("Vehiculo espacial tipo: \tNave de Lanzadera");
                        System.out.println(lanzadera.toString());
                        System.out.println("");
                        System.out.println("-----------------------------------------------------------------");
                    }

                    for (nave_Espacial_no_Tripulada noTripulada : tipo2) {
                        System.out.println("Vehiculo espacial tipo: \tNave no Tripulada");
                        System.out.println(noTripulada.toString());
                        System.out.println("");

                        System.out.println("-----------------------------------------------------------------");
                    }

                    for (nave_Espacial_Tripulada tripulada : tipo3) {
                        System.out.println("Vehiculo espacial tipo: \tNave  Tripulada");
                        System.out.println(tripulada.toString());
                        System.out.println("");

                        System.out.println("-----------------------------------------------------------------");
                    }

                    break;
            }

        }
    }

    //Cree esta clase para poder ahorrar espacio en el la funcion principal
    public int prefiltrador(ArrayList<vehiculo_Lanzadera> tipo1, ArrayList<nave_Espacial_no_Tripulada> tipo2, ArrayList<nave_Espacial_Tripulada> tipo3) {
        int segun = 0;
        int cantidadTotal = tipo1.size() + tipo2.size() + tipo3.size();

        if (cantidadTotal <= 0) {
            System.out.println("-------------------------------------");
            System.out.println("No hay naves en la lista aun");
            System.out.println("-------------------------------------");
            return 0;
        }
        while (segun > 5 || segun <= 0) {
            System.out.println("Selecciones el parametro utilizado para buscar una nave");
            System.out.println("1)Nacionalidad/origen de la nave");
            System.out.println("2)Si se encuentra en actividad o no");
            System.out.println("3)Posee un cierto indice de carga");
            segun = leer.nextInt();
        }

        String parametro = "";

        switch (segun) {
            case 1:
                System.out.println("Indique la Nacionalidad que desea buscar entre las naves");
                parametro = leer.next();
                filtrador(tipo1, tipo2, tipo3, segun, parametro);

                break;

            case 2:
                System.out.println("Indique en servicio o  inactividad");
                boolean actividad = true;
                boolean service = false;
                while (actividad) {
                    System.out.println("Activo ---> si");
                    System.out.println("Inactivo -->no");
                    parametro = leer.next();
                    if (parametro.toLowerCase().equals("si")) {
                        actividad = false;
                        service = true;
                    } else if (parametro.toLowerCase().equals("no")) {
                        actividad = false;
                    }
                }
                filtrador(tipo1, tipo2, tipo3, segun, parametro);

                break;

            case 3:
                System.out.println("Indique el minimo de carga que debe soportar la nave");
                parametro = leer.next();
                filtrador(tipo1, tipo2, tipo3, segun, parametro);

                break;
        }
        return 1;
    }

    //desde esta clase redirigo a cada accion segun lo que se busque hace en las opciones de busqueda por filtrado
    public void filtrador(ArrayList<vehiculo_Lanzadera> tipo1, ArrayList<nave_Espacial_no_Tripulada> tipo2, ArrayList<nave_Espacial_Tripulada> tipo3, int segun, String filtro) {

        boolean service = false;
        if (filtro.equalsIgnoreCase("si")) {
            service = true;
        } else if (filtro.equalsIgnoreCase("no")) {
            service = false;
        }
        switch (segun) {
            case 1:
                segunOrigen(tipo1, tipo2, tipo3, filtro);

                break;

            case 2:
                enServicio(tipo1, tipo2, tipo3, service);

                break;

            case 3:
                segunPeso(tipo1, tipo2, tipo3, filtro);

                break;
        }

    }

    
    //se busca una clase que responda con las caracterosticas de pais de origen
    public void segunOrigen(ArrayList<vehiculo_Lanzadera> tipo1, ArrayList<nave_Espacial_no_Tripulada> tipo2, ArrayList<nave_Espacial_Tripulada> tipo3, String filtro) {

        Iterator<vehiculo_Lanzadera> it = tipo1.iterator();
        Iterator<nave_Espacial_no_Tripulada> it2 = tipo2.iterator();
        Iterator<nave_Espacial_Tripulada> it3 = tipo3.iterator();
        int contador = 0;

        while (it.hasNext()) {
            vehiculo_Lanzadera next = it.next();
            if (next.getNacionalidad().equalsIgnoreCase(filtro)) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }
        while (it2.hasNext()) {
            nave_Espacial_no_Tripulada next = it2.next();
            if (next.getNacionalidad().equalsIgnoreCase(filtro)) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }
        while (it3.hasNext()) {
            nave_Espacial_Tripulada next = it3.next();
            if (next.getNacionalidad().equalsIgnoreCase(filtro)) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("No existen naves que cumplan el criterio");
            System.out.println("-----------------------------------------------------------------");
        }

    }

    //Si se creo la nave o el vehiculo no\tripulado se verifica que si la misma se declaro como funcionando en servicio o no
    public void enServicio(ArrayList<vehiculo_Lanzadera> tipo1, ArrayList<nave_Espacial_no_Tripulada> tipo2, ArrayList<nave_Espacial_Tripulada> tipo3, boolean filtro) {

        Iterator<vehiculo_Lanzadera> it = tipo1.iterator();
        Iterator<nave_Espacial_no_Tripulada> it2 = tipo2.iterator();
        Iterator<nave_Espacial_Tripulada> it3 = tipo3.iterator();
        int contador = 0;

        while (it.hasNext()) {
            vehiculo_Lanzadera next = it.next();
            if (filtro == next.isActivo()) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }

        while (it2.hasNext()) {
            nave_Espacial_no_Tripulada next = it2.next();
            if (filtro == next.isActivo()) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }

        while (it3.hasNext()) {
            nave_Espacial_Tripulada next = it3.next();
            if (filtro == next.isActivo()) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No existen naves que cumplan ese criterio");
        }

    }

    
    //se filtra las clases si cumplen con el requeriminto de peso minimo
    public void segunPeso(ArrayList<vehiculo_Lanzadera> tipo1, ArrayList<nave_Espacial_no_Tripulada> tipo2, ArrayList<nave_Espacial_Tripulada> tipo3, String filtro) {

        Iterator<vehiculo_Lanzadera> it = tipo1.iterator();
        Iterator<nave_Espacial_no_Tripulada> it2 = tipo2.iterator();
        Iterator<nave_Espacial_Tripulada> it3 = tipo3.iterator();
        int comparar = Integer.parseInt(filtro);
        int contador = 0;

        while (it.hasNext()) {
            vehiculo_Lanzadera next = it.next();
            if (next.getCapaDeCarga() >= comparar) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }
        while (it2.hasNext()) {
            nave_Espacial_no_Tripulada next = it2.next();
            if (next.getCapaDeCarga() >= comparar) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }
        while (it3.hasNext()) {
            nave_Espacial_Tripulada next = it3.next();
            if (next.getCapaDeCarga() >= comparar) {
                System.out.println("----------------------------------------");
                System.out.println("Coincidencia encontrada");
                System.out.println(next.toString());
                System.out.println("----------------------------------------");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("No existen naves que cumplan el criterio");
            System.out.println("-----------------------------------------------------------------");
        }

    }

}
