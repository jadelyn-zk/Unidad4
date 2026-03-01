package parte3ej5;

public class mainEj5 {
    public static void main(String[] args) {
        numerosAleatorios na = new numerosAleatorios();
        
        System.out.println("numeros    aleatorios del 0-1:"); 
        na.numerosAleatorios(3);
        System.out.println("numeros aleatorios del 0-10:"); 
        na.numerosAleatorios(3, 10);
        System.out.println("numeros aleatorios del 5-15:"); 
        na.numerosAleatorios(3, 5, 15);
    }
    
    
}