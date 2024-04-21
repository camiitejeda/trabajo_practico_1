package ar.edu.unju.fi.ejercicio18_main;
import ar.edu.unju.fi.ejercicio18_model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Main {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Pais> paises = new ArrayList<>();
		        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

		        try {
		        paises.add(new Pais(1, "España"));
		        paises.add(new Pais(2, "Francia"));
		        paises.add(new Pais(3, "Argentina"));
		        int opcion = 0;
		        do {
		            System.out.println("Menú de opciones:");
		            System.out.println("1 - Alta de destino turístico");
		            System.out.println("2 - Mostrar todos los destinos turísticos");
		            System.out.println("3 - Modificar el país de un destino turístico");
		            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
		            System.out.println("5 - Eliminar un destino turístico");
		            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
		            System.out.println("7 - Mostrar todos los países");
		            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
		            System.out.println("9 - Salir");

		            System.out.print("Ingrese una opción: ");
		            opcion = scanner.nextInt();

		            switch (opcion) {
		            case 1:

	                    System.out.print("Ingrese el nombre del destino turístico: ");
	                    String nombreDestino = scanner.next();
	                    System.out.print("Ingrese el código del país asociado: ");
	                    int codigoPais = scanner.nextInt();
	                    Pais paisAsociado = null;
	                    for (Pais pais : paises) {
	                        if (pais.getCodigo() == codigoPais) {
	                            paisAsociado = pais;
	                            break;
	                        }
	                    }
	                    if (paisAsociado != null) {
	                        destinos.add(new DestinoTuristico(destinos.size() + 1, nombreDestino, codigoPais, paisAsociado, 0));
	                        System.out.println("Destino turístico agregado con éxito.");
	                    } else {
	                        System.out.println("El código de país ingresado no es válido.");
	                    }
	                    break;

	                case 2:

	                    for (DestinoTuristico destino : destinos) {
	                        System.out.println(destino.getNombre());
	                    }
	                    break;

	                case 3:

	                    System.out.print("Ingrese el código del destino turístico a modificar: ");
	                    int codigoDestino = scanner.nextInt();
	                    System.out.print("Ingrese el nuevo código de país: ");
	                    int nuevoCodigoPais = scanner.nextInt();
	                    for (DestinoTuristico destino : destinos) {
	                        if (destino.getCodigo() == codigoDestino) {
	                            for (Pais pais : paises) {
	                                if (pais.getCodigo() == nuevoCodigoPais) {
	                                    destino.setPais(pais);
	                                    System.out.println("País modificado con éxito.");
	                                    break;
	                                }
	                            }
	                            break;
	                        }
	                    }
	                    break;

	                case 4:

	                    destinos.clear();
	                    System.out.println("Lista de destinos turísticos vaciada.");
	                    break;

	                case 5:

	                    System.out.print("Ingrese el código del destino turístico a eliminar: ");
	                    int codigoEliminar = scanner.nextInt();
	                    Iterator<DestinoTuristico> iterator = destinos.iterator();
	                    while (iterator.hasNext()) {
	                        DestinoTuristico destino = iterator.next();
	                        if (destino.getCodigo() == codigoEliminar) {
	                            iterator.remove();
	                            System.out.println("Destino turístico eliminado con éxito.");
	                            break;
	                        }
	                    }
	                    break;

	                case 6:

	                    Collections.sort(destinos, (d1, d2) -> d1.getNombre().compareTo(d2.getNombre()));
	                    for (DestinoTuristico destino : destinos) {
	                        System.out.println(destino.getNombre());
	                    }
	                    break;

	                case 7:

	                    for (Pais pais : paises) {
	                        System.out.println(pais.getNombre());
	                    }
	                    break;

	                case 8:

	                    System.out.print("Ingrese el código del país: ");
	                    int codigoPaisMostrar = scanner.nextInt();
	                    for (DestinoTuristico destino : destinos) {
	                        if (destino.getPais().getCodigo() == codigoPaisMostrar) {
	                            System.out.println(destino.getNombre());
	                        }
	                    }
	                    break;

	                case 9:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }

	        } while (opcion != 9);
		        	} catch (Exception e) {
		            System.out.println("Ha ocurrido un error inesperado. Detalles: " + e.getMessage());
		        
		            scanner.close();
		            }
		        }
		    }
		
	

