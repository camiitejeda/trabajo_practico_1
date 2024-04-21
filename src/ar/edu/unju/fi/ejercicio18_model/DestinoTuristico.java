package ar.edu.unju.fi.ejercicio18_model;

public class DestinoTuristico {
    private int codigo;
    private String nombre;
    private double precio;
    private Pais pais;
    private int cantidadDias;

    public DestinoTuristico(int codigo, String nombre, double precio, Pais pais, int cantidadDias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.pais = pais;
        this.cantidadDias = cantidadDias;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Pais getPais() {
        return pais;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}