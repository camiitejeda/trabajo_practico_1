package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Por favor ingrese un número entero en el rango [1, 9]: ");
        int numero = num.nextInt();

        if (numero < 1 || numero > 9) {
            System.out.println("El número ingresado está fuera del rango válido.");
        } else {
            System.out.println("Tabla de multiplicar del " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }

        num.close();
    }

	}
