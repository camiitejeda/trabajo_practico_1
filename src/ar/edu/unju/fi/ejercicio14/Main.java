package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
int numero = 0, suma = 0;
		
		while (numero < 3 || numero > 10) {
			System.out.println("Ingrese un numero para determinar el espacio del arreglo en el rango [3,10]: ");
			numero = scanner.nextInt();
			if (numero < 3 || numero > 10) {
				System.out.println("Valor fuera de rango");
			}
		}
		
		int [] arreglo = new int [numero]; 
		
		 for (int i = 0; i < arreglo.length; i++) {
	            System.out.print("Ingrese un número entero para la posición " + i + ": ");
	            arreglo[i] = scanner.nextInt();
	        }
		 
	        System.out.println("Valores almacenados en el array:");
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.println("Índice " + i + ": " + arreglo[i]);
	            scanner.close();
	        }
	        for (int i=0; i < arreglo.length; i++) {
	        	suma += arreglo[i];
	        }
	        System.out.println("Suma de todos los valores del arreglo: "+suma);
	        scanner.close();
	}

}