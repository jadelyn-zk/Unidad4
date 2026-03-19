package ejerciciosU4parte1;

public class Articulo {
    private String nombre;
    private double precio;
    private double iva;
    private int cuantosQuedan;
    
    // Constructor
    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
        setNombre(nombre);
        setPrecio(precio);
        setIva(iva);
        setCuantosQuedan(cuantosQuedan);
    }
    
    // Método para calcular precio con IVA
    public double getPrecioConIVA() {
        return precio + (precio * iva / 100);
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public double getIva() {
        return iva;
    }
    
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    
    // Setters con validación
    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            this.nombre = "Pijama";  // Valor por defecto si está vacío o nulo
        } else {
            this.nombre = nombre;    // Asigna el nombre si no está vacío
        }
    }
    
    public void setPrecio(double precio) {
        if (precio <= 0) {
            this.precio = 5;          // Valor por defecto si es inválido
        } else {
            this.precio = precio;      // Asigna el precio si es válido
        }
    }
    
    public void setIva(double iva) {
        if (iva != 21) {
            this.iva = 21;             // Si no es 21, poner 21 por defecto
        } else {
            this.iva = iva;             // Si es 21, mantenerlo
        }
    }
    
    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan <= 0) {
            this.cuantosQuedan = 1;    // Valor por defecto si es inválido
        } else {
            this.cuantosQuedan = cuantosQuedan;  // Asigna si es válido
        }
    }
    
    // Método para imprimir información
    public void imprimirInfo() {
        System.out.println(nombre + " - Precio: " + precio + "€. " +
                          "Precio con IVA: " + getPrecioConIVA() + "€. " +
                          "IVA: " + iva + "% " +
                          "Stock: " + cuantosQuedan);
    }
}