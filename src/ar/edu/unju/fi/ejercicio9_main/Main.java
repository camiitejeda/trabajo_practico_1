package ar.edu.unju.fi.ejercicio9_main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9_model.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos de la clase Producto
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Descuento (%): ");
            int descuento = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Crear objeto Producto con los datos ingresados
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setPrecio(precio);
            producto.setDescuento(descuento);

            // Mostrar los datos ingresados y el precio con descuento
            System.out.println("Datos del producto " + (i + 1) + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: $" + producto.calcularDescuento());
            System.out.println();
        }

        scanner.close();
    }
	}

