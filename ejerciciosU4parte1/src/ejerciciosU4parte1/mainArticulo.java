package ejerciciosU4parte1;

public class mainArticulo {
    public static void main(String[] args) {
        // Crear objeto directamente con valores válidos
        Articulo art1 = new Articulo("", 0, 1.0, 0);
        
        
        // Usar el método de la clase para imprimir
        art1.imprimirInfo();
        
        // Cambiar el precio usando setter
        art1.setPrecio(20.0);
        
        // Volver a imprimir
        art1.imprimirInfo();
    }
}