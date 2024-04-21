package ar.edu.unju.fi.ejercicio12_model;
import java.util.*;

public class Persona {
	private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (ahora.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public String obtenerSignoZodiaco() {
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    public String obtenerEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;

        if (mes >= 3 && mes <= 5) {
            return "Primavera";
        } else if (mes >= 6 && mes <= 8) {
            return "Verano";
        } else if (mes >= 9 && mes <= 11) {
            return "Otoño";
        } else {
            return "Invierno";
        }
    }

    public String toString() {
        return "Nombre: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento.get(Calendar.DATE) + "/"
                + (fechaNacimiento.get(Calendar.MONTH) + 1) + "/" + fechaNacimiento.get(Calendar.YEAR) + "\nEdad: "
                + calcularEdad() + " años\nSigno del zodiaco: " + obtenerSignoZodiaco() + "\nEstación: "
                + obtenerEstacion();
    }
    }
