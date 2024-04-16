package ar.edu.unju.fi.ejercicio10_model;

public class Pizza {
	private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // Constantes para los adicionales de ingredientes especiales
    private final double ADICIONAL_20 = 500;
    private final double ADICIONAL_30 = 750;
    private final double ADICIONAL_40 = 1000;

    // Constructor por defecto
    public Pizza() {
    }

    // Métodos accesores
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        if (diametro == 20 || diametro == 30 || diametro == 40) {
            this.diametro = diametro;
        } else {
            System.out.println("El diámetro debe ser 20, 30 o 40.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    public void calcularPrecio() {
        if (diametro == 20) {
            precio = ingredientesEspeciales ? 4500 + ADICIONAL_20 : 4500;
        } else if (diametro == 30) {
            precio = ingredientesEspeciales ? 4800 + ADICIONAL_30 : 4800;
        } else if (diametro == 40) {
            precio = ingredientesEspeciales ? 5500 + ADICIONAL_40 : 5500;
        }
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}
