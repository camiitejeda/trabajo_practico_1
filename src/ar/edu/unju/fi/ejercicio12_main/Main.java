package ar.edu.unju.fi.ejercicio12_main;
import java.util.*;
import ar.edu.unju.fi.ejercicio12_model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimientoStr = scanner.nextLine();
        String[] partes = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1;
        int anio = Integer.parseInt(partes[2]);

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(anio, mes, dia);

        Persona persona = new Persona(nombre, fechaNacimiento);
        System.out.println("\nDatos de la persona:\n" + persona);

        scanner.close();
	}

}
