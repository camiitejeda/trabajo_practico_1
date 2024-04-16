package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Por favor ingrese un número entero en el rango [0, 10]: ");
        int numero = num.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("El número ingresado está fuera del rango válido.");
        } else {
        	
            int factorial = 1;
            int cont = 1;
            
            while (cont <= numero) {
                factorial *= cont;
                cont++;
            }
            
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        num.close();
        }
	}