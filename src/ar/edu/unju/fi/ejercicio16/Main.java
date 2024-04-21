package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Definir y crear un array para almacenar 5 elementos de tipo String
        String[] nombres = new String[5];

        // Pedir al usuario que ingrese nombres usando un bucle for
        System.out.println("Ingrese los nombres de las personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los valores guardados en el array usando un bucle while
        System.out.println("\nValores guardados en el arreglo:");
        int i = 0;
        while (i < nombres.length) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
            i++;
        }

        // Mostrar el tamaño del array
        System.out.println("\nTamaño del arreglo: " + nombres.length);

        // Solicitar al usuario que ingrese el índice de un elemento a eliminar
        byte indiceEliminar;
        do {
            System.out.print("Ingrese el índice (0-4) del elemento a eliminar: ");
            indiceEliminar = scanner.nextByte();
        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

        // Eliminar el elemento del arreglo y realizar el desplazamiento si es necesario
        for (int j = indiceEliminar; j < nombres.length - 1; j++) {
            nombres[j] = nombres[j + 1];
        }
        nombres[nombres.length - 1] = ""; // Asignar un espacio en blanco al último elemento eliminado

        // Mostrar el arreglo nuevamente
        System.out.println("\nArreglo después de eliminar el elemento:");
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        scanner.close();
	}

}
