package ar.edu.unju.fi.ejercicio7_main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7_model.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitar datos para un nuevo empleado
        System.out.println("Ingrese los datos para un nuevo empleado:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Legajo: ");
        int legajo = scanner.nextInt();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        // Crear objeto Empleado utilizando el constructor parametrizado
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // Mostrar los datos del empleado antes del aumento
        System.out.println("\nDatos del empleado antes del aumento:");
        empleado.mostrarDatos();

        // Dar un aumento al salario del empleado
        empleado.darAumento();

        // Mostrar los datos del empleado después del aumento
        System.out.println("\nDatos del empleado después del aumento:");
        empleado.mostrarDatos();

        scanner.close();
    }
	}

