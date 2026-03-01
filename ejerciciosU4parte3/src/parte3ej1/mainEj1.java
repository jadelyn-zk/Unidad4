package parte3ej1;

public class mainEj1 {

    public static void main(String[] args) {
        // Crear objetos con los constructores
        sumas sumarint = new sumas(3, 5);        // Usa constructor de enteros
        sumas sumarDouble = new sumas(4.9, 1.2); // Usa constructor de doubles

      
        // También puedes hacerlo directamente
        System.out.println("Suma int directa: " + sumarint.suma());           // 8
        System.out.println("Suma double directa: " + sumarDouble.sumaD());    // 6.1
    }
}