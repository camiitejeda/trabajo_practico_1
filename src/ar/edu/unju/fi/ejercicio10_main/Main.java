package ar.edu.unju.fi.ejercicio10_main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10_model.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear 3 objetos de la clase Pizza
        for (int i = 1; i <= 3; i++) {
            System.out.println("** Pizza " + i + " **");
            Pizza pizza = new Pizza();

            // Ingresar datos
            System.out.print("Diámetro (20, 30 o 40): ");
            int diametro = scanner.nextInt();
            pizza.setDiametro(diametro);

            System.out.print("Ingredientes especiales (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            pizza.setIngredientesEspeciales(ingredientesEspeciales);

            // Calcular precio y área
            pizza.calcularPrecio();
            pizza.calcularArea();

            // Mostrar datos
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
            System.out.println();
        }

        scanner.close();
    }
}
