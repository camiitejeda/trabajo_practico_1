package ar.edu.unju.fi.ejercicio6_main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6_model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);

        // Creación de objeto usando constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Creación de persona usando constructor por defecto:");
        persona1.mostrarDatos();
        System.out.println();

        // Creación de objeto usando constructor parametrizado
        System.out.println("Ingrese los datos de la persona usando constructor parametrizado:");
        System.out.print("DNI: ");
        String dni = p.nextLine();
        System.out.print("Nombre: ");
        String nombre = p.nextLine();
        System.out.print("Fecha de nacimiento (aaaa-mm-dd): ");
        LocalDate fechaNacimiento = LocalDate.parse(p.nextLine());
        System.out.print("Provincia: ");
        String provincia = p.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        System.out.println("Creación de persona usando constructor parametrizado:");
        persona2.mostrarDatos();
        System.out.println();

        // Creación de objeto usando constructor con dni, nombre y fecha de nacimiento
        System.out.println("Ingrese los datos de la persona usando constructor con dni, nombre y fecha de nacimiento:");
        System.out.print("DNI: ");
        dni = p.nextLine();
        System.out.print("Nombre: ");
        nombre = p.nextLine();
        System.out.print("Fecha de nacimiento (aaaa-mm-dd): ");
        fechaNacimiento = LocalDate.parse(p.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        System.out.println("Creación de persona usando constructor con dni, nombre y fecha de nacimiento:");
        persona3.mostrarDatos();

        p.close();
    }
	}